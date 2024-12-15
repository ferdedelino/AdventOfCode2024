package org.commons;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LinearEquationSystem<T extends Number> {
    private final int rows;
    private final int columns;
    private final Matrix<T> originalMatrix;
    @Getter
    private Matrix<T> matrix = null;
    private final Matrix<T> originalVector;
    @Getter
    private Matrix<T> vector = null;
    private int currentPivotRow = 0;

    public LinearEquationSystem(Matrix<T> matrix, Matrix<T> vector) {
        if (matrix.getRows() != vector.getRows())
            throw new ArithmeticException("Matrix and vector must have same number of rows!");
        this.originalMatrix = matrix.copy();
        this.originalVector = vector.copy();
        this.rows = matrix.getRows();
        this.columns = matrix.getColumns();
    }

    public void performGaussAlgorithm() {
        this.currentPivotRow = 0;
        this.matrix = originalMatrix.copy();
        this.vector = originalVector.copy();
        for (int column = 0; column < this.columns; column++) {
            solveColumn(column);
        }

        for (int row = 0; row < this.rows; row++) {
            cleanUpRows(row);
        }
    }

    private void solveColumn(int column) {
        switchZerosToBottom(column);
        int lastNonZeroRow = lastNonZeroRow(column);
        if (lastNonZeroRow == -1)
            return;
        T pivotValue = matrix.getValue(currentPivotRow, column);
        T inverse = matrix.getNumericOperations().invert(pivotValue);
        multiplyRowBy(currentPivotRow, inverse);
        for (int row = currentPivotRow + 1; row <= lastNonZeroRow; row++) {
            T firstColumnValue = matrix.getValue(row, column);
            addRowToRow(currentPivotRow, row, matrix.getNumericOperations().negate(firstColumnValue));
        }
        this.currentPivotRow++;
    }

    private void cleanUpRows(int pivotRow) {
        int pivotColumn = -1;
        for (int column = 0; column < this.columns; column++) {
            if (isZero(pivotRow, column))
                continue;
            pivotColumn = column;
            break;
        }
        if (pivotColumn == -1) // All 0 row. Nothing to clean up
            return;

        for (int row = 0; row < pivotRow; row++) {
            T firstColumnValue = matrix.getValue(row, pivotColumn);
            addRowToRow(pivotRow, row, matrix.getNumericOperations().negate(firstColumnValue));
        }
    }

    private void switchZerosToBottom(int column) {
        while (!switchZerosToBottom1(column));
    }

    private int lastNonZeroRow(int column) {
        for (int row = this.rows - 1; row >= currentPivotRow; row--) {
            if (isZero(row, column))
                continue;
            return row;
        }
        return -1;
    }

    private boolean switchZerosToBottom1(int column) {
        int firstZeroRow = -1;
        for (int row = currentPivotRow; row < this.rows; row++) {
            boolean isZero = isZero(row, column);
            if (isZero && firstZeroRow == -1) {
                firstZeroRow = row;
                continue;
            }
            if (!isZero && firstZeroRow != -1) {
                switchRows(row, firstZeroRow);
                return false;
            }
        }
        return true;
    }

    public EquationSolution<T> generateSolution() {
        if (matrix == null)
            performGaussAlgorithm();
        boolean isSolvable = true;
        for (int row = rows - 1; row >= 0; row--) {
            // is there a zero-row with a non-zero solution
            boolean zeroRow = true;
            for (int column = 0; column < columns; column++) {
                if (!isZero(row, column)) {
                    zeroRow = false;
                    break;
                }
            }
            if (!zeroRow)
                break;
            if (!vector.getNumericOperations().isZero(vector.getValue(row, 0))) {
                isSolvable = false;
                break;
            }
        }

        if (isSolvable) {
            List<T> solutionVector = new ArrayList<>();
            for (int row = 0; row < vector.getRows(); row++) {
                solutionVector.add(vector.getValue(row, 0));
            }
            return new EquationSolution<>(true, generateKernelBasis(), generateSpecificSolution(solutionVector, -1, calculateFreeVariables()), matrix.getNumericOperations());
        }
        return new EquationSolution<>(false, generateKernelBasis(), null, matrix.getNumericOperations());
    }

    private List<List<T>> generateKernelBasis() {
        if (matrix == null)
            performGaussAlgorithm();

        List<T> solutionVector = new ArrayList<>();
        for (int i = 0; i < vector.getRows(); i++) {
            solutionVector.add(matrix.getNumericOperations().zero());
        }

        List<Integer> freeVariables = calculateFreeVariables();
        List<List<T>> kernelBasis = new ArrayList<>();
        // i-th free variable is 1, the others are 0. Values for non-free variables follows from this
        for (int setFreeVariable : freeVariables) {
            List<T> basisVector = generateSpecificSolution(solutionVector, setFreeVariable, freeVariables);
            kernelBasis.add(basisVector);
        }
        return kernelBasis;
    }

    private List<T> generateSpecificSolution(List<T> solutionVector, int freeVariableNonZero, List<Integer> freeVariables) {
        List<T> solution = new ArrayList<>(rows);
        for (int i = 0; i < rows; i++) {
            solution.add(matrix.getNumericOperations().zero());
        }

        int relevantMatrixRow = rows - freeVariables.size() - 1;
        for (int solutionColumn = rows - 1; solutionColumn >= 0; solutionColumn--) {
            if (freeVariables.contains(solutionColumn)) {
                solution.set(solutionColumn, freeVariableNonZero == solutionColumn ? matrix.getNumericOperations().one() : matrix.getNumericOperations().zero());
                continue;
            }
            // variable 1*xi = 0 - (xi+1 + xi+2 + ....); (xi is normed)
            T sum = solutionVector.get(solutionColumn);
            for (int i = columns - 1; i > solutionColumn; i--) {
                // sum -= matrix[relevantMatrixRow][i]
                T multipliedValue = matrix.getNumericOperations().multiply(matrix.getValue(relevantMatrixRow, i), solution.get(i));
                sum = matrix.getNumericOperations().add(sum, matrix.getNumericOperations().negate(multipliedValue));
            }
            solution.set(solutionColumn, sum);
            relevantMatrixRow--;
        }

        return solution;
    }

    private List<Integer> calculateFreeVariables() {
        List<Integer> freeVariables = new ArrayList<>();
        List<Integer> pivotColumns = new ArrayList<>();
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                if (!isZero(row, column)) {
                    pivotColumns.add(column);
                    break;
                }
            }
        }
        for (int i = 0; i < columns; i++) {
            if (!pivotColumns.contains(i))
                freeVariables.add(i);
        }
        return freeVariables;
    }

    private void switchRows(int row1, int row2) {
        matrix.switchRows(row1, row2);
        vector.switchRows(row1, row2);
    }

    private void multiplyRowBy(int row, T multiplier) {
        matrix.multiplyRowBy(row, multiplier);
        vector.multiplyRowBy(row, multiplier);
    }

    private void addRowToRow(int staticRow, int changedRow, T multiplier) {
        matrix.addRowToRow(staticRow, changedRow, multiplier);
        vector.addRowToRow(staticRow, changedRow, multiplier);
    }

    private boolean isZero(int row, int column) {
        return matrix.getNumericOperations().isZero(matrix.getValue(row, column));
    }
}

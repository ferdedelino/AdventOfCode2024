package org.example;

import lombok.Getter;

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

    public void solveColumn(int column) {
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

    public void switchZerosToBottom(int column) {
        while (!switchZerosToBottom1(column));
    }

    public int lastNonZeroRow(int column) {
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
                matrix.switchRows(row, firstZeroRow);
                return false;
            }
        }
        return true;
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

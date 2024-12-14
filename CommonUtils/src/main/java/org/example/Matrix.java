package org.example;

import lombok.Getter;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Matrix <T extends Number> {

    private int m; //rows
    private int n; //columns

    private Number[][] matrix;
    @Getter
    private final NumericOperations<T> numericOperations;

    public Matrix(T[][] matrix, Class<T> clazz) {
        this(matrix, NumericOperations.byClass(clazz));
    }

    public Matrix(T[][] matrix, NumericOperations<T> numericOperations) {
        this.m = matrix.length;
        this.n = matrix[0].length;
        this.matrix = new Number[this.m][];
        for (int i = 0; i < this.m; i++) {
            T[] row = matrix[i];
            if (row.length != this.n)
                throw new ArithmeticException("Matrix has rows of unequal length!");
            Number[] r = new Number[this.n];
            System.arraycopy(row, 0, r, 0, this.n);
            this.matrix[i] = r;
        }
        this.numericOperations = numericOperations;
    }

    public Matrix<T> copy() {
        return new Matrix<T>((T[][]) matrix, numericOperations);
    }

    public void multiplyRowBy(int row, T lambda) {
        for (int j = 0; j < this.n; j++) {
            matrix[row][j] = multiply(getValue(row, j), lambda);
        }
    }

    public void switchRows(int row1, int row2) {
        Number[] temp = matrix[row1];
        matrix[row1] = matrix[row2];
        matrix[row2] = temp;
    }

    public void addRowToRow(int staticRow, int changedRow, T multiplier) {
        for (int j = 0; j < this.n; j++) {
            T currentValue = getValue(changedRow, j);
            T newValue = add(currentValue, multiply(getValue(staticRow, j), multiplier));
            matrix[changedRow][j] = newValue;
        }
    }

    private T multiply(T x, T y) {
        return numericOperations.multiply(x, y);
    }

    private T add(T x, T y) {
        return numericOperations.add(x, y);
    }

    private T negate(T x) {
        return numericOperations.negate(x);
    }

    public int getRows() {
        return this.m;
    }

    public int getColumns() {
        return this.n;
    }

    @SuppressWarnings("cast")
    public T getValue(int row, int column) {
        return ((T) matrix[row][column]);
    }

    @Override
    public String toString() {
        return Arrays.stream(matrix).map(Arrays::toString).collect(Collectors.joining("\n"));
    }

}

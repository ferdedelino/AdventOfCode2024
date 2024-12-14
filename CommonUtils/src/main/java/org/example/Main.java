package org.example;


public class Main {

    private int x;
    public static void main(String[] args) {
        Double[][] matrix = new Double[3][];
        matrix[0] = new Double[]{1D, 1D, 1D};
        matrix[1] = new Double[]{0D, 2D, 2D};
        matrix[2] = new Double[]{1D, 3D, 3D};

        Double[][] vector = new Double[3][];
        vector[0] = new Double[]{0D};
        vector[1] = new Double[]{1D};
        vector[2] = new Double[]{0D};

        Matrix<Double> matrix1 = new Matrix<>(matrix, Double.class);
        Matrix<Double> vector1 = new Matrix<>(vector, Double.class);

        LinearEquationSystem<Double> equationSystem = new LinearEquationSystem<>(matrix1, vector1);
        equationSystem.performGaussAlgorithm();
        System.out.println(equationSystem.getMatrix());
    }
}
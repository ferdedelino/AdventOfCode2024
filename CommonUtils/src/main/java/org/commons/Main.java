package org.commons;


public class Main {

    private int x;
    public static void main(String[] args) {
        example1();
    }

    private static void example1() {
        Double[][] matrix = new Double[4][4];
        matrix[0] = new Double[] {1D, 1D ,0D, 1D};
        matrix[1] = new Double[] {0D, 6D, 1D ,1D};
        matrix[2] = new Double[] {0D, 0D, 0D ,0D};
        matrix[3] = new Double[] {0D, 0D, 0D ,0D};

        Double[][] vector = new Double[4][];
        vector[0] = new Double[] {1D};
        vector[1] = new Double[] {1D};
        vector[2] = new Double[] {0D};
        vector[3] = new Double[] {0D};

        Matrix<Double> matrix1 = new Matrix<>(matrix, Double.class);
        Matrix<Double> vector1 = new Matrix<>(vector, Double.class);
        LinearEquationSystem<Double> sy = new LinearEquationSystem<>(matrix1, vector1);
        EquationSolution<Double> solution = sy.generateSolution();
        System.out.println("Solution:");
        System.out.println(solution);
    }

    private static void example2() {
        Double[][] matrix = new Double[4][4];
        matrix[0] = new Double[] {1D, 1D ,0D, 1D};
        matrix[1] = new Double[] {0D, 6D, 1D ,1D};
        matrix[2] = new Double[] {0D, 0D, 0D ,0D};
        matrix[3] = new Double[] {0D, 0D, 0D ,0D};

        Double[][] vector = new Double[4][];
        vector[0] = new Double[] {1D};
        vector[1] = new Double[] {1D};
        vector[2] = new Double[] {0D};
        vector[3] = new Double[] {0D};

        Matrix<Double> matrix1 = new Matrix<>(matrix, Double.class);
        Matrix<Double> vector1 = new Matrix<>(vector, Double.class);
        LinearEquationSystem<Double> sy = new LinearEquationSystem<>(matrix1, vector1);
        EquationSolution<Double> solution = sy.generateSolution();
        System.out.println("Solution:");
        System.out.println(solution);
    }
}
package com.example.matrixmultiplication;

public class MatrixMultiplication {
    public static void main(String[] args)
    {
        int[][] A = {{3, 5, -3, 2},
                {3, -1, 3, 5},
                {5, 4, 1, -2}};

        int[][] B = {{-3, 5, 2},
                {5, -3, 4},
                {-3, 5, -4},
                {1, 4, -2}};

        int[][] C = {{0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}};

        for(int i = 0; i < 3 ; i++) {
            for (int j = 0; j < 3; j++) {
                C[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}
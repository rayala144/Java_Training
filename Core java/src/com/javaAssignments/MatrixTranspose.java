package com.javaAssignments;

public class MatrixTranspose {

	public static void main(String[] args) {

		int row = 3, column = 3;
        int[][] matrix = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };

        Output(matrix);
        
        int[][] transpose = new int[column][row];
        for(int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        Output(transpose);
    }

    public static void Output(int[][] matrix) {
        System.out.println("Matrix: ");
        for(int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + "  ");
            }
            System.out.println("\n");
        }
    }

}

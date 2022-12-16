package com.javaAssignments;

public class MatrixMultiplication {

	public static void main(String[] args) {

		int rows = 3, columns = 3;
        int[][] Matrix1 = { {0, 0, 1}, {3, 9, 8}, {2, 6, 5} };
        int[][] Matrix2 = { {1, 0, 1}, {0, 0, 0}, {0, 8, 4} };

        int[][] Sub = new int[rows][columns];
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                Sub[i][j] = Matrix1[i][j] * Matrix2[i][j];
            }
        }

        System.out.println("Multiplication of two matrices is: ");
        for(int[] row : Sub) {
            for (int column : row) {
                System.out.print(column + "\t");
            }
            System.out.println();
        }
	}

}

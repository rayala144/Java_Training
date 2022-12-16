package com.javaAssignments;

public class MatrixSubtraction {

	public static void main(String[] args) {

		int rows = 4, columns = 3;
        int[][] Matrix1 = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {3, 8, 5} };
        int[][] Matrix2 = { {9, 4, 9}, {5, 3, 2}, {7, 6, 1}, {4, 0, 5} };

        int[][] Sub = new int[rows][columns];
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                Sub[i][j] = Matrix1[i][j] - Matrix2[i][j];
            }
        }

        System.out.println("Subtraction of two matrices is: ");
        for(int[] row : Sub) {
            for (int column : row) {
                System.out.print(column + "\t");
            }
            System.out.println();
        }
	}

}

package com.javaAssignments;

public class MatrixAddition {

	public static void main(String[] args) {
			
		
		int rows = 3, columns = 3;
        int[][] Matrix1 = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        int[][] Matrix2 = { {9, 4, 9}, {5, 3, 2}, {7, 6, 1} };

        int[][] Add = new int[rows][columns];
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                Add[i][j] = Matrix1[i][j] + Matrix2[i][j];
            }
        }

        System.out.println("Sum of two matrices is: ");
        for(int[] row : Add) {
            for (int column : row) {
                System.out.print(column + "\t");
            }
            System.out.println();
        }
	}

}

package com.javaAssignments;

public class MatrixDivision {

	public static void main(String[] args) {

		float rows = 2.0f, columns = 3.0f;
        float[][] Matrix1 = { {6, 2, 1}, {8, 3, 18} };
        float[][] Matrix2 = { {2, 1, 1}, {2, 1, 3} };

        float[][] Sub = new float[(int) rows][(int) columns];
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                Sub[i][j] = (Matrix1[i][j] / Matrix2[i][j]);
            }
        }

        System.out.println("Division of two matrices is: ");
        for(float[] row : Sub) {
            for (float column : row) {
                System.out.print(column + "\t");
            }
            System.out.println();
        }
	}

}

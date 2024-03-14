package Java.EstructurasDeDatos.Utilities.MatrixMethods;

import Java.EstructurasDeDatos.Utilities.RandomNumber;

public class FillMatrix {

    public int[][] fillIntMatrix(int[][] matrix, int top, int botttom) {
        RandomNumber randomNumber = new RandomNumber();
        for (int[] row : matrix) {
            for (int i = 0; i < row.length; i++) {
                row[i] = randomNumber.generate(top, botttom);
            }
        }
        return matrix;
    }
}
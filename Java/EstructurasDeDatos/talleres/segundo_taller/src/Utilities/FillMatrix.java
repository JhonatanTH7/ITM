package Java.EstructurasDeDatos.talleres.segundo_taller.src.Utilities;

public class FillMatrix {

    public int[][] fillIntMAtrix(int[][] matrix, int top, int botttom) {
        RandomNumber randomNumber = new RandomNumber();
        for (int[] row : matrix) {
            for (int column : row) {
                row[column] = randomNumber.generate(top, botttom);
            }
        }
        return matrix;
    }
}
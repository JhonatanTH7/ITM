package Java.EstructurasDeDatos.talleres.segundo_taller.src.Utilities;

/**
 * FillMatrix
 */
public class FillMatrix {

    public int[][] fillIntMAtrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int column : row) {
                row[column] = 0;
            }
        }
        return matrix;
    }
}
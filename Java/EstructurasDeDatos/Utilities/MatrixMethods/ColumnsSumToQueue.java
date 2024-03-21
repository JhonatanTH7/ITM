package Java.EstructurasDeDatos.Utilities.MatrixMethods;

import java.util.LinkedList;
import java.util.Queue;

public class ColumnsSumToQueue {
    public Queue<Integer> generate(int[][] matrix) {
        Queue<Integer> sumCols = new LinkedList<>();
        for (int i = 0; i < matrix[0].length; i++) {
            int acumCols = 0;
            for (int[] row : matrix) {
                acumCols += row[i];
            }
            sumCols.offer(acumCols);
        }
        return sumCols;
    }
}

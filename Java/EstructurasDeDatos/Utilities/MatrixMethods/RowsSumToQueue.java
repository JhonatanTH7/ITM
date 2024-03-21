package Java.EstructurasDeDatos.Utilities.MatrixMethods;

import java.util.LinkedList;
import java.util.Queue;

public class RowsSumToQueue {
    public Queue<Integer> generate(int[][] matrix) {
        Queue<Integer> sumRows = new LinkedList<>();
        for (int[] row : matrix) {
            int acumRows = 0;
            for (int column : row) {
                acumRows += column;
            }
            sumRows.offer(acumRows);
        }
        return sumRows;
    }
}

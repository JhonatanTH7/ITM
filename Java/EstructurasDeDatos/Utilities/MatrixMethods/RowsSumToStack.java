package Java.EstructurasDeDatos.Utilities.MatrixMethods;

import java.util.Stack;

public class RowsSumToStack {
    public Stack<Integer> generate(int[][] matrix) {
        Stack<Integer> sumRows = new Stack<>();
        for (int[] row : matrix) {
            int acumRows = 0;
            for (int column : row) {
                acumRows += column;
            }
            sumRows.push(acumRows);
        }
        return sumRows;
    }
}

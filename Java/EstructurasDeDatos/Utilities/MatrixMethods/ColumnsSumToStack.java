package Java.EstructurasDeDatos.Utilities.MatrixMethods;

import java.util.Stack;

public class ColumnsSumToStack {
    public Stack<Integer> generate(int[][] matrix) {
        Stack<Integer> sumCols = new Stack<>();
        for (int i = 0; i < matrix[0].length; i++) {
            int acumCols = 0;
            for (int[] row : matrix) {
                acumCols += row[i];
            }
            sumCols.push(acumCols);
        }
        return sumCols;
    }
}

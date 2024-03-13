package Java.EstructurasDeDatos.talleres.segundo_taller.src.Utilities;

public class PrintMatrix {
    public void printDoubleMatrix(double[][] matrix) {
        System.out.println(" ");
        for (double[] row : matrix) {
            for (double column : row) {
                System.out.print(column + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }

    public void printIntMatrix(int[][] matrix) {
        System.out.println(" ");
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }

    public void printStringMatrix(String[][] matrix) {
        System.out.println(" ");
        for (String[] row : matrix) {
            for (String column : row) {
                System.out.print(column + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }

    public void printBooleanMatrix(boolean[][] matrix) {
        System.out.println(" ");
        for (boolean[] row : matrix) {
            for (boolean column : row) {
                System.out.print(column + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }
}

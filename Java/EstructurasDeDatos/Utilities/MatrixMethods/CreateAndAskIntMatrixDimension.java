package Java.EstructurasDeDatos.Utilities.MatrixMethods;

import java.util.Scanner;

public class CreateAndAskIntMatrixDimension {
    public Scanner read = new Scanner(System.in);

    public int[][] NxN_Matrix() {
        int n = 0;
        boolean flag = true;
        do {
            try {
                System.out.println("Enter the dimension of the matrix (just one number since it is a NxN matrix)");
                n = read.nextInt();
                flag = false;
            } catch (Exception e) {
                System.out.println("Entered value is not valid, try again");
            }
        } while (flag == true);
        int[][] matrix = new int[n][n];
        return matrix;

    }

    public int[][] NxM_Matrix() {
        int n = 0, m = 0;
        boolean flag = true;
        do {
            try {
                System.out.println("Enter the number of rows in the matrix");
                n = read.nextInt();
                System.out.println("Enter the number of columns in the matrix");
                m = read.nextInt();
                flag = false;
            } catch (Exception e) {
                System.out.println("Entered value is not valid, try again");
            }
        } while (flag == true);
        int[][] matrix = new int[n][m];
        return matrix;
    }
}

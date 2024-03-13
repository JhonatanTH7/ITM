package Java.EstructurasDeDatos.talleres.segundo_taller.src.Exercise1;

import Java.EstructurasDeDatos.talleres.segundo_taller.src.Utilities.FillMatrix;
import Java.EstructurasDeDatos.talleres.segundo_taller.src.Utilities.PrintMatrix;

public class Main {
    public static void main(String[] args) {
        // 1) crear un programa que con el ingreso de una matriz n* n muestre las
        // siguientes opciones
        // 1: método pila con la suma de las filas de la matriz
        // 2: método cola con la suma de las columnas de la matriz
        // 3: método donde muestre la factorial de la dimensión de la matriz
        // 4: método cola donde muestre los números ordenados de mayor a menor de la
        // cola
        int[][] matrix=new int[3][3];
        FillMatrix fillMatrix=new FillMatrix();
        fillMatrix.fillIntMAtrix(matrix,20,10);
        PrintMatrix printMatrix=new PrintMatrix();
        printMatrix.printIntMatrix(matrix);
    }
}

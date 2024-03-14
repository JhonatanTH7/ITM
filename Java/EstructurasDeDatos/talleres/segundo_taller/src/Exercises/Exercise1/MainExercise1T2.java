package Java.EstructurasDeDatos.talleres.segundo_taller.src.Exercises.Exercise1;

import Java.EstructurasDeDatos.Utilities.MatrixMethods.CreateAndAskIntMatrixDimension;
import Java.EstructurasDeDatos.Utilities.MatrixMethods.FillMatrix;
import Java.EstructurasDeDatos.Utilities.MatrixMethods.PrintMatrix;

public class MainExercise1T2 {
    public void exercise1() {
        // 1) crear un programa que con el ingreso de una matriz n* n muestre las
        // siguientes opciones
        // 1: método pila con la suma de las filas de la matriz
        // 2: método cola con la suma de las columnas de la matriz
        // 3: método donde muestre la factorial de la dimensión de la matriz
        // 4: método cola donde muestre los números ordenados de mayor a menor de la
        // cola)
        PrintMatrix printMatrix = new PrintMatrix();
        CreateAndAskIntMatrixDimension CreateAndAskIntMatrixDimension = new CreateAndAskIntMatrixDimension();
        FillMatrix fillMatrix = new FillMatrix();
        int[][] matrix = fillMatrix.fillIntMatrix(CreateAndAskIntMatrixDimension.NxM_Matrix(), 30, 15);
        printMatrix.printIntMatrix(matrix);
    }
}

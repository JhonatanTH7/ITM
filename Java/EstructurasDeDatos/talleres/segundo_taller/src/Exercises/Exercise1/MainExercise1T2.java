package Java.EstructurasDeDatos.talleres.segundo_taller.src.Exercises.Exercise1;

import Java.EstructurasDeDatos.Utilities.Factorial;
import Java.EstructurasDeDatos.Utilities.MatrixMethods.CreateAndAskIntMatrixDimension;
import Java.EstructurasDeDatos.Utilities.MatrixMethods.FillMatrix;
import Java.EstructurasDeDatos.Utilities.MatrixMethods.PrintMatrix;
import Java.EstructurasDeDatos.Utilities.QueueMethods.PrintQueue;
import Java.EstructurasDeDatos.Utilities.QueueMethods.SortQueue;
import Java.EstructurasDeDatos.Utilities.StackMethods.PrintStack;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class MainExercise1T2 {
    public void exercise1() {
        // 1) crear un programa que con el ingreso de una matriz n*n muestre las
        // siguientes opciones
        // 1: método pila con la suma de las filas de la matriz
        // 2: método cola con la suma de las columnas de la matriz
        // 3: método donde muestre la factorial de la dimensión de la matriz
        // 4: método cola donde muestre los números ordenados de mayor a menor de la
        // cola
        PrintMatrix printMatrix = new PrintMatrix();
        CreateAndAskIntMatrixDimension CreateAndAskIntMatrixDimension = new CreateAndAskIntMatrixDimension();
        FillMatrix fillMatrix = new FillMatrix();
        int[][] matrix = fillMatrix.fillIntMatrix(CreateAndAskIntMatrixDimension.NxN_Matrix(), 30, 15);
        printMatrix.printIntMatrix(matrix);


        Stack<Integer> sumRows = new Stack<>();
        for (int[] row : matrix) {
            int acumRows = 0;
            for (int column : row) {
                acumRows += column;
            }
            sumRows.push(acumRows);
        }
        PrintStack printStack = new PrintStack();
        System.out.print("Stack with the sum of the rows: ");
        printStack.printIntegerStack(sumRows);


        Queue<Integer> sumCols = new LinkedList<>();
        for (int i = 0; i < matrix[0].length; i++) {
            int acumCols = 0;
            for (int[] row : matrix) {
                acumCols += row[i];
            }
            sumCols.offer(acumCols);
        }
        PrintQueue printQueue = new PrintQueue();
        System.out.print("Stack with the sum of the columns: ");
        printQueue.printIntegerQueue(sumCols);


        Factorial factorial = new Factorial();
        System.out.println("Factorial of matrix's dimension: " + factorial.calculate(matrix.length));


        SortQueue sortQueue = new SortQueue();
        System.out.print("Columns Queue ordered from highest to lowest: ");
        sumCols = sortQueue.sortDescendant(sumCols);
        printQueue.printIntegerQueue(sumCols);
    }
}

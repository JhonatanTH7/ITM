package Java.EstructurasDeDatos.talleres.segundo_taller.src.Exercises.Exercise1;

import Java.EstructurasDeDatos.Utilities.Factorial;
import Java.EstructurasDeDatos.Utilities.MatrixMethods.*;
import Java.EstructurasDeDatos.Utilities.QueueMethods.PrintQueue;
import Java.EstructurasDeDatos.Utilities.QueueMethods.SortQueue;
import Java.EstructurasDeDatos.Utilities.StackMethods.PrintStack;

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
        //Creación y llenado de la matriz
        int[][] matrix = fillMatrix.fillIntMatrix(CreateAndAskIntMatrixDimension.NxN_Matrix(), 30, 15);
        printMatrix.printIntMatrix(matrix);

        //Suma de las filas en pila
        RowsSumToStack rowsSumToStack = new RowsSumToStack();
        PrintStack printStack = new PrintStack();
        Stack<Integer> sumRows = rowsSumToStack.generate(matrix);
        System.out.print("Stack with the sum of the rows: ");
        printStack.printIntegerStack(sumRows);

        //Suma de las columnas en cola
        ColumnsSumToQueue columnsSumToQueue = new ColumnsSumToQueue();
        PrintQueue printQueue = new PrintQueue();
        Queue<Integer> sumCols = columnsSumToQueue.generate(matrix);
        System.out.print("Queue with the sum of the columns: ");
        printQueue.printIntegerQueue(sumCols);

        //Factorial de la dimension de la matriz
        Factorial factorial = new Factorial();
        System.out.println("Factorial of matrix's dimension: " + factorial.calculate(matrix.length));

        //Cola de columnas ordenada de mayor a menor
        SortQueue sortQueue = new SortQueue();
        System.out.print("Columns Queue ordered from highest to lowest: ");
        sumCols = sortQueue.sortDescendant(sumCols);
        printQueue.printIntegerQueue(sumCols);
    }
}

package Java.EstructurasDeDatos.talleres.segundo_taller.src.Exercises.Exercise6;

import java.util.Stack;

import Java.EstructurasDeDatos.Utilities.MatrixMethods.*;
import Java.EstructurasDeDatos.Utilities.StackMethods.*;

public class MainExercise6T2 {
    public void Exercise6() {
        // 6) cree un programa que reciba una matriz n*m que en una pila guarde lo
        // siguiente
        // 1: la suma de todas las filas y muestre el promedio de las filas, resultado
        // en una pila
        // 2: la suma de las columnas y muestre la raíz cuadrada de cada elemento
        // 3: la multiplicación de matriz a * matriz b y que la muestre en una pila

        // Creación y llenado de la matriz
        PrintMatrix printMatrix = new PrintMatrix();
        FillMatrix fillMatrix = new FillMatrix();
        CreateAndAskIntMatrixDimension createAndAskIntMatrixDimension = new CreateAndAskIntMatrixDimension();
        int[][] matrixA = fillMatrix.fillIntMatrix(createAndAskIntMatrixDimension.NxM_Matrix(), 20, 1);
        printMatrix.printIntMatrix(matrixA);

        // Suma de las filas y promedio
        RowsSumToStack rowsSumToStack = new RowsSumToStack();
        AverageOfAStack averageOfAStack = new AverageOfAStack();
        PrintStack printStack = new PrintStack();
        Stack<Integer> rowsStack = rowsSumToStack.generate(matrixA);
        printStack.printIntegerStack(rowsStack);
        double average = averageOfAStack.calculate(rowsStack);
        System.out.println("The average of the sum of the rows is: " + average);

        // Suma de las columnas y raiz cuadrada de cada elemento
        ColumnsSumToStack columnsSumToStack = new ColumnsSumToStack();
        Stack<Integer> colsStack = columnsSumToStack.generate(matrixA);
        printStack.printIntegerStack(colsStack);
        for (int element : colsStack) {
            System.out.println("Square root of " + element + " = " + Math.sqrt(element));
        }

        // Multiplicacion de matriz a * matriz b y resultado en una pila
        System.out.println("==== Matriz a ====");
        printMatrix.printIntMatrix(matrixA);
        System.out.println("\nLet's create the second matrix\n");
        System.out.println("==== Matriz b ====");
        int[][] matrixB = fillMatrix.fillIntMatrix(createAndAskIntMatrixDimension.NxM_Matrix(), 20, 1);
        printMatrix.printIntMatrix(matrixB);
        if (matrixA[0].length == matrixB.length) {
            MatrixMultiplications matrixMultiplications = new MatrixMultiplications();
            matrixMultiplications.multiplicate(matrixA, matrixB);
        } else {
            System.out.println("The matrix entered can't be multiplied because it's dimensions");
        }
    }
}

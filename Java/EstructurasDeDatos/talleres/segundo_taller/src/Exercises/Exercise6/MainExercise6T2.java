package Java.EstructurasDeDatos.talleres.segundo_taller.src.Exercises.Exercise6;

import Java.EstructurasDeDatos.Utilities.MatrixMethods.*;
import Java.EstructurasDeDatos.Utilities.StackMethods.AverageOfAStack;

public class MainExercise6T2 {
    public void Exercise6() {
//        6) cree un programa que reciba una matriz n*m que en una pila guarde lo siguiente
//        1: la suma de todas las filas y muestre el promedio de las filas, resultado en una pila
//        2: la suma de las columnas y muestre la raíz cuadrada de cada elemento
//        3: la multiplicación de matriz a * matriz b y que la muestre en una pila

        //Creación y llenado de la matriz
        PrintMatrix printMatrix = new PrintMatrix();
        CreateAndAskIntMatrixDimension createAndAskIntMatrixDimension = new CreateAndAskIntMatrixDimension();
        int[][] matrix = createAndAskIntMatrixDimension.NxM_Matrix();
        printMatrix.printIntMatrix(matrix);

        //Suma de las filas y promedio
        ColumnsSumToStack columnsSumToStack = new ColumnsSumToStack();
        AverageOfAStack averageOfAStack = new AverageOfAStack();
        double average = averageOfAStack.calculate(columnsSumToStack.generate(matrix));
        System.out.println("The average of the sum of the rows is: " + average);

    }
}

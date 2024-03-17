package Java.EstructurasDeDatos.talleres.segundo_taller.src.Exercises.Exercise3;

import Java.EstructurasDeDatos.Utilities.StackMethods.PrintStack;

import java.util.Scanner;
import java.util.Stack;

public class MainExercise3T2 {
    public void exercise3(Scanner read) {
        //3) crear un programa que de una pila de n elementos valide y ejecute lo siguiente:
        //1- validar si el número es negativo reemplazarlo por 0
        //2- si el número esta entre 8 y 20 debe reemplazar por 50
        //3- si el número es mayor que 60 y menor que 62 se debe reemplazar por 100
        System.out.println("Enter the number of elements you are going to input");
        int n = read.nextInt();
        Stack<Integer> numbersStack = new Stack<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the element #" + (i + 1));
            int number = read.nextInt();
            if (number < 0) {
                number = 0;
            } else if (number > 7 && number < 21) {
                number = 50;
            } else if (number > 59 && number < 63) {
                number = 100;
            }
            numbersStack.push(number);
        }
        PrintStack printStack = new PrintStack();
        printStack.printIntegerStack(numbersStack);
        read.nextLine();//Para eliminar el caracter que deja haber leído antes
    }
}

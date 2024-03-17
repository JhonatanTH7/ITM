package Java.EstructurasDeDatos.talleres.segundo_taller.src.Exercises.Exercise5;

import Java.EstructurasDeDatos.Utilities.Factorial;
import Java.EstructurasDeDatos.Utilities.ListMethods.PrintList;
import Java.EstructurasDeDatos.Utilities.StackMethods.PrintStack;

import java.util.Scanner;
import java.util.Stack;

public class MainExercise5T2 {
    public void Exercise5() {
        //5) cree un programa que reciba un vector, y que en una pila muestre la factorial de cada
        //número
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the number of elements you are going to input");
        int[] vector = new int[read.nextInt()];
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Enter the element #" + (i + 1));
            vector[i] = read.nextInt();
        }
        factorialStackMethod(vector);
    }

    public void factorialStackMethod(int[] vector) {
        Factorial factorial = new Factorial();
        Stack<Integer> factorialStack = new Stack<>();
        for (int number : vector) {
            factorialStack.push(factorial.calculate(number));
        }
        PrintStack printStack = new PrintStack();
        PrintList printList = new PrintList();
        System.out.print("Vector of numbers entered: ");
        printList.printIntList(vector);
        System.out.print("Stack of factorials: ");
        printStack.printIntegerStack(factorialStack);
    }
}

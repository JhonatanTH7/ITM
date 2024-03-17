package Java.EstructurasDeDatos.Utilities.StackMethods;

import java.util.Stack;

public class PrintStack {
    public void printIntegerStack(Stack<Integer> stack) {
        for (Integer element : stack) {
            System.out.print(element + " ");
        }
        System.out.println(" ");
    }

    public void printStringStack(Stack<String> stack) {
        for (String element : stack) {
            System.out.print(element + " ");
        }
        System.out.println(" ");
    }

    public void printDoubleStack(Stack<Double> stack) {
        for (double element : stack) {
            System.out.print(element + " ");
        }
        System.out.println(" ");
    }

    public void printBooleanStack(Stack<Boolean> stack) {
        for (boolean element : stack) {
            System.out.print(element + " ");
        }
        System.out.println(" ");
    }

    public void printCharacterStack(Stack<Character> stack) {
        for (char element : stack) {
            System.out.print(element + " ");
        }
        System.out.println(" ");
    }
}

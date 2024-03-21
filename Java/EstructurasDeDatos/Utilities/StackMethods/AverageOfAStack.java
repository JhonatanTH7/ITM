package Java.EstructurasDeDatos.Utilities.StackMethods;

import java.util.Stack;

public class AverageOfAStack {
    public double calculate(Stack<Integer> stack) {
        int acumElements = 0;
        for (int element : stack) {
            acumElements += element;
        }
        return (double) acumElements / stack.size();
    }
}

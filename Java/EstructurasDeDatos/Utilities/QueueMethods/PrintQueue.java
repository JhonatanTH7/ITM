package Java.EstructurasDeDatos.Utilities.QueueMethods;

import java.util.Queue;

public class PrintQueue {
    public void printIntegerQueue(Queue<Integer> queue) {
        for (Integer element : queue) {
            System.out.print(element + " ");
        }
        System.out.println(" ");
    }

    public void printStringQueue(Queue<String> queue) {
        for (String element : queue) {
            System.out.print(element + " ");
        }
        System.out.println(" ");
    }

    public void printDoubleQueue(Queue<Double> queue) {
        for (double element : queue) {
            System.out.print(element + " ");
        }
        System.out.println(" ");
    }

    public void printBooleanQueue(Queue<Boolean> queue) {
        for (boolean element : queue) {
            System.out.print(element + " ");
        }
        System.out.println(" ");
    }
}
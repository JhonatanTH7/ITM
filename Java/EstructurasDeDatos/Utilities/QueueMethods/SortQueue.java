package Java.EstructurasDeDatos.Utilities.QueueMethods;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class SortQueue {

    public Queue<Integer> sortDescendant(Queue<Integer> queue) {
        Queue<Integer> colaOrdenada = new PriorityQueue<>(Collections.reverseOrder());
        colaOrdenada.addAll(queue);
        return colaOrdenada;
    }

    public PriorityQueue<Integer> sortAscendant(Queue<Integer> queue) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int element : queue) {
            priorityQueue.offer(element);
        }
        return priorityQueue;
    }
}

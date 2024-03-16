package Java.EstructurasDeDatos.Utilities.QueueMethods;

import java.util.PriorityQueue;
import java.util.Queue;

public class SortQueue {

    public Queue<Integer> sortDescendant(Queue<Integer> queue) {
        Queue<Integer> sortedQueue = new PriorityQueue<>((a, b) -> Integer.compare(b, a));
        for (int element : queue) {
            sortedQueue.offer(element);
        }
        return sortedQueue;
    }

    public PriorityQueue<Integer> sortAscendant(Queue<Integer> queue) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int element : queue) {
            priorityQueue.offer(element);
        }
        return priorityQueue;
    }
}

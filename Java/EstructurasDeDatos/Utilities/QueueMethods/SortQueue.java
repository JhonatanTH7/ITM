package Java.EstructurasDeDatos.Utilities.QueueMethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class SortQueue {

    public Queue<Integer> sortDescendant(Queue<Integer> cola) {
        ArrayList<Integer> auxList = new ArrayList<>();
        while (!cola.isEmpty()) {
            auxList.add(cola.poll());
        }
        auxList.sort(Collections.reverseOrder());
        for (int element : auxList) {
            cola.offer(element);
        }
        return cola;
    }

    public Queue<Integer> sortAscendant(Queue<Integer> cola) {
        ArrayList<Integer> auxList = new ArrayList<>();
        while (!cola.isEmpty()) {
            auxList.add(cola.poll());
        }
        Collections.sort(auxList);
        for (int element : auxList) {
            cola.offer(element);
        }
        return cola;
    }
}

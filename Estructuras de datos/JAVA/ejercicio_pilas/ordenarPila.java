package JAVA.ejercicio_pilas;

import java.util.Collections;
import java.util.Stack;

public class ordenarPila {
    public void ascendente(Stack<Integer> pila) {
        Collections.sort(pila);
        System.out.println(pila);
    }
}

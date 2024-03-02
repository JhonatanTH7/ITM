package JAVA.ejercicio_pilas;

import java.util.Collections;
import java.util.Stack;

public class ordenarPila {
    public void ascendente(Stack<Integer> pilaAux) {
        Collections.sort(pilaAux);
        System.out.println(pilaAux);
    }
}

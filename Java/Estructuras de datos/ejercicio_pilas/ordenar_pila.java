package ejercicio_pilas;

import java.util.Collections;
import java.util.Stack;

public class ordenar_pila {
    public void ascendente(Stack<Integer> pilaAux) {
        Collections.sort(pilaAux);
        System.out.println(pilaAux);
    }
}

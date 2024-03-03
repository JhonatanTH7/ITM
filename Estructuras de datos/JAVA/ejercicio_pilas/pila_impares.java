package JAVA.ejercicio_pilas;

import java.util.Stack;

public class pila_impares {

    public void generarPila(Stack<Integer> pila) {
        Stack<Integer> pilaImpares = new Stack<>();
        for (int elemento : pila) {
            if (elemento % 2 != 0) {
                pilaImpares.push(elemento);
            }
        }
        System.out.println("La pila impar generada de la pila original " + pila + " es: ");
        System.out.println(pilaImpares);
    }
}

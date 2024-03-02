package JAVA.ejercicio_pilas;

import java.util.Stack;

public class promedioPila {
    public void promedio(Stack<Integer> pila) {
        double acumulador = 0;
        for (int elemento : pila) {
            acumulador += elemento;
        }
        System.out.println("El promedio es " + (acumulador / pila.size()));
    }
}

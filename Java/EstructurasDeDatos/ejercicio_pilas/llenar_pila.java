package Java.EstructurasDeDatos.ejercicio_pilas;

import java.util.Stack;

public class llenar_pila {
    public Stack<Integer> llenar(int dimension) {
        numero_random nr = new numero_random();
        Stack<Integer> pila = new Stack<>();
        for (int i = 0; i < dimension; i++) {
            pila.push(nr.generarNumero());
        }
        return pila;
    }
}

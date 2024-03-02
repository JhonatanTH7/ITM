import java.util.Stack;

public class llenarPila {
    public Stack<Integer> llenar(int dimension) {
        numeroRandom nr = new numeroRandom();
        Stack<Integer> pila = new Stack<>();
        for (int i = 0; i < dimension; i++) {
            pila.push(nr.generarNumero());
        }
        return pila;
    }
}

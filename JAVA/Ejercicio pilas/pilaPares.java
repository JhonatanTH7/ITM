import java.util.Stack;

public class pilaPares {
    public void generarPila(Stack<Integer> pila) {
        Stack<Integer> pilaPares = new Stack<>();
        for (int elemento : pila) {
            if (elemento % 2 == 0) {
                pilaPares.push(elemento);
            }
        }
        System.out.println("La pila par generada de la pila original " + pila + " es: ");
        System.out.println(pilaPares);
    }
}

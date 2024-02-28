import java.util.Stack;

/**
 * pilas
 */
public class pilas {

    public static void main(String[] args) {
        numeroRandom numRan = new numeroRandom();
        Stack<Integer> pila = new Stack<Integer>();
        int mayor = 0;
        int menor = 99999;
        for (Integer i = 0; i < 10; i++) {
            pila.push(numRan.generarNumero());
        }

        for (int i = 0; i < pila.size(); i++) {
            System.out.print(pila.pop() + " ");
            if (mayor < pila.peek()) {
                mayor = pila.peek();
            }
            if (menor > pila.peek()) {
                menor = pila.peek();
            }
            pila.pop();
        }

        System.out.println("");
        System.out.println(mayor);
        System.out.println(menor);
    }
}
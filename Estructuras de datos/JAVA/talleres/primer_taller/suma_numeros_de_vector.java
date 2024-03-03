package JAVA.talleres.primer_taller;

public class suma_numeros_de_vector {

    public int sumar(int vector[]) {
        int contador = 0;
        for (int i = 0; i < vector.length; i++) {
            contador += vector[i];
        }
        return contador;
    }
}

package JAVA.ejercicio_pilas;

import java.util.Random;

public class numero_random {
    public int generarNumero() {
        Random r = new Random();
        return r.nextInt(20) + 1;
    }
}

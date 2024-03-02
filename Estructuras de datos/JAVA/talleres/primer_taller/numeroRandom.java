package JAVA.talleres.primer_taller;

import java.util.Random;

public class numeroRandom {
    public int generarNumero() {
        Random r = new Random();
        return r.nextInt(20) + 1;
    }
}

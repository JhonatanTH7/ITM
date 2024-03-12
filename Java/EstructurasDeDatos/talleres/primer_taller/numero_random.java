package Java.EstructurasDeDatos.talleres.primer_taller;

import java.util.Random;

public class numero_random {
    public int generarNumero() {
        Random r = new Random();
        return r.nextInt(30) + 1;
    }
}

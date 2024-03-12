package repaso_matrices;

import java.util.Random;

/**
 * numeroAleatorio
 */
public class numero_aleatorio {
    public int numero() {
        Random random = new Random();
        int numRandom = random.nextInt(60) + 1;
        return numRandom;
    }
}
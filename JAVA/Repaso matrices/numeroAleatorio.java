import java.util.Random;

/**
 * numeroAleatorio
 */
public class numeroAleatorio {
    public int numero() {
        Random random = new Random();
        int numRandom = random.nextInt(60) + 1;
        return numRandom;
    }
}
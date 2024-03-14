package Java.EstructurasDeDatos.Utilities;

import java.util.Random;

public class RandomNumber {
    public int generate(int top, int bottom) {
        Random random = new Random();
        return (random.nextInt(top - bottom + 1) + bottom);
    }
}

package Java.EstructurasDeDatos.Utilities;

public class Factorial {
    public int calculate(int number) {
        int factorialNumber = 1;
        for (int i = 2; i < number + 1; i++) {
            factorialNumber *= i;
        }
        return factorialNumber;
    }
}

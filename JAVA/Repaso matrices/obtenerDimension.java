import java.util.Scanner;

public class obtenerDimension {
    Scanner read = new Scanner(System.in);

    public int pedirDimension() {
        int dimension;
        System.out.println("Ingrese la dimension n de la matriz nxn");
        dimension = read.nextInt();
        return dimension;
    }
}

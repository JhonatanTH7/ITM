package Java.EstructurasDeDatos.repaso_matrices;

import java.util.Scanner;

public class obtener_dimension {
    Scanner read = new Scanner(System.in);

    public int pedirDimension() {
        int dimension;
        System.out.println("Ingrese la dimension n de la matriz nxn");
        dimension = read.nextInt();
        return dimension;
    }
}

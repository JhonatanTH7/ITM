package Java.EstructurasDeDatos.talleres.primer_taller;

import Java.EstructurasDeDatos.ejercicio_pilas.numero_random;

/**
 * crearMatriz
 */
public class matriz {

    public int[][] crearMatriz(int dimension) {
        numero_random nr = new numero_random();
        int matriz[][] = new int[dimension][dimension];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = nr.generarNumero();
            }
        }
        imprimirMatriz(matriz);
        return matriz;
    }

    public void imprimirMatriz(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
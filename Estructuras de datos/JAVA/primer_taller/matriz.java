package JAVA.primer_taller;

import JAVA.ejercicio_pilas.numeroRandom;

/**
 * crearMatriz
 */
public class matriz {

    public int[][] crearMatriz(int dimension) {
        numeroRandom nr = new numeroRandom();
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
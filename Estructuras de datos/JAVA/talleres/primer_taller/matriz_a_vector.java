package JAVA.talleres.primer_taller;

public class matriz_a_vector {
    public int[] pasar_a_vector(int[][] matriz) {
        int[] vector = new int[matriz.length * matriz.length];
        int contador = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                vector[contador] = matriz[i][j];
                contador++;
            }
        }
        return vector;
    }

    public void imprimir_vector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
    }
}
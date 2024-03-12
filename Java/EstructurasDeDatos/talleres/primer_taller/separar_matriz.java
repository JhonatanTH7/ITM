package Java.EstructurasDeDatos.talleres.primer_taller;

public class separar_matriz {
    public void sumaFilasYColumnas(int matriz[][]) {
        int sumaFilas[] = sumaFilas(matriz);
        int sumaColumnas[] = sumaColumnas(matriz);
        System.out.println("=== Suma de las filas ===");
        for (int i = 0; i < sumaFilas.length; i++) {
            System.out.print(sumaFilas[i] + " ");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("=== Suma de las columnas ===");
        for (int i = 0; i < sumaColumnas.length; i++) {
            System.out.print(sumaColumnas[i] + " ");
        }
        System.out.println("");
    }

    public int[] sumaColumnas(int matriz[][]) {
        int sumac[] = new int[matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                sumac[j] += matriz[i][j];
            }
        }
        return sumac;
    }

    public int[] sumaFilas(int matriz[][]) {
        int sumaf[] = new int[matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                sumaf[i] += matriz[i][j];
            }
        }
        return sumaf;
    }
}

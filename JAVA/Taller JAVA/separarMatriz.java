public class separarMatriz {
    public void sumar(int matriz[][]) {
        int sumaFilas[] = filas(matriz);
        int sumaColumnas[] = columnas(matriz);
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

    public int[] columnas(int matriz[][]) {
        int suma[] = new int[matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                suma[j] += matriz[i][j];
            }
        }
        return suma;
    }

    public int[] filas(int matriz[][]) {
        int suma[] = new int[matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                suma[i] += matriz[i][j];
            }
        }
        return suma;
    }
}

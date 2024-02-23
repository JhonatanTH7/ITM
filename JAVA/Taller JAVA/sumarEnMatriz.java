public class sumarEnMatriz {
    public void sumar(int matriz[][]) {
        int sumaFilas[] = new int[matriz.length];
        int sumaColumnas[] = new int[matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                sumaFilas[i] += matriz[i][j];
                sumaColumnas[j] += matriz[i][j];
            }
        }
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
}

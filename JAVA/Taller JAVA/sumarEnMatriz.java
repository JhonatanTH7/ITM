public class sumarEnMatriz {
    public void sumar(int matriz[][]) {
        int sumaFilas[] = new int[matriz.length];
        int sumaColumnas[] = new int[matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            int acumuladorFilas = 0;
            for (int j = 0; j < matriz.length; j++) {
                acumuladorFilas += matriz[i][j];
            }
            sumaFilas[i] = acumuladorFilas;
        }
        System.out.println("=== Suma de las filas ===");
        System.out.println("");
        for (int i = 0; i < sumaFilas.length; i++) {
            System.out.println(sumaFilas[i]);
        }
    }
}

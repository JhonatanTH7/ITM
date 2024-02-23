public class numeroMayor {
    public void mayor(int matriz[][]) {
        int mayor = 0;
        int fila = 0;
        int columna = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                    columna = j;
                    fila = i;
                }
            }
        }
        System.out.println(
                "El numero mayor es " + mayor + " y se encuentra en la columna " + (columna + 1) + " y la fila "
                        + (fila + 1));
    }
}

public class infoMatriz {
    public void mostrar(int matriz[][]) {
        System.out.println("");
        System.out.println("===== Matriz de " + matriz.length + "x" + matriz.length + " =====");
        System.out.println("");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public int[][] llenar(int matriz[][]) {
        numeroAleatorio numeroAleatorio = new numeroAleatorio();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = numeroAleatorio.numero();
            }
        }
        return matriz;
    }
}

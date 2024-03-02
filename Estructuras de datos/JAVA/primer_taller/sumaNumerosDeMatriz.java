package JAVA.primer_taller;

public class sumaNumerosDeMatriz {
    public int sumar(int matriz[][]) {
        int contador = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                contador += matriz[i][j];
            }
        }
        return contador;
    }
}

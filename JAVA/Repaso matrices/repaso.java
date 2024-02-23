
/**
 * holamundo
 */

public class repaso {

    public static void main(String[] args) {
        obtenerDimension obtenerDimension = new obtenerDimension();
        infoMatriz infoMatriz = new infoMatriz();
        calculosMatriz calculosMatriz = new calculosMatriz();
        int dimension;
        dimension = obtenerDimension.pedirDimension();
        int[][] matriz = new int[dimension][dimension];
        matriz = infoMatriz.llenar(matriz);
        infoMatriz.mostrar(matriz);
        System.out.println("El promedio de la matriz es " + calculosMatriz.promedio(matriz));
        calculosMatriz.numeroMayor(matriz);
        calculosMatriz.pares(matriz);
        calculosMatriz.impares(matriz);
        calculosMatriz.diagonalSuperior(matriz);
        calculosMatriz.contadorPrimos(matriz);
    }
}
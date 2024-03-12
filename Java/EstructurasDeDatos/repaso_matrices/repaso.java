package Java.EstructurasDeDatos.repaso_matrices;

/**
 * holamundo
 */

public class repaso {

    public static void main(String[] args) {
        obtener_dimension obtenerDimension = new obtener_dimension();
        info_matriz infoMatriz = new info_matriz();
        calculos_matriz calculosMatriz = new calculos_matriz();
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
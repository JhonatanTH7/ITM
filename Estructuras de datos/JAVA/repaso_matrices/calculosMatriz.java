package JAVA.repaso_matrices;

public class calculosMatriz {
    public float promedio(int matriz[][]) {
        float numeroElementos = matriz.length * matriz.length;
        float sumaElementos = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                sumaElementos += matriz[i][j];
            }
        }
        return sumaElementos / numeroElementos;
    }

    public void numeroMayor(int matriz[][]) {
        int mayor = 0;
        int contador = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] > mayor) {
                    contador = 1;
                    mayor = matriz[i][j];
                } else if (matriz[i][j] == mayor) {
                    contador++;
                }
            }
        }
        System.out.println("El numero mayor es " + mayor + " y se repite " + contador + " veces");
    }

    public void diagonalSuperior(int matriz[][]) {
        System.out.print("Los elementos de la diagonal principal son ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (j == i) {
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }
        System.out.println("");
    }

    public void pares(int matriz[][]) {
        System.out.println("===== Los numeros pares son =====");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if ((matriz[i][j] % 2) == 0) {
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }
        System.out.println("");
    }

    public void impares(int matriz[][]) {
        System.out.println("===== Los numeros impares son =====");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if ((matriz[i][j] % 2) != 0) {
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }
        System.out.println("");
    }

    public void contadorPrimos(int matriz[][]) {
        int contador = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (primos(matriz[i][j])) {
                    contador++;
                }
            }
        }
        System.out.println("La cantidad de numeros primos en la matriz es " + contador);
    }

    public boolean primos(int num) {
        if (num == 2 || num == 7 || num == 3 || num == 5) {
            return true;
        }
        if (num == 1 || num % 2 == 0 || num % 5 == 0 || num % 3 == 0 || num % 7 == 0) {
            return false;
        }
        return true;
    }

}

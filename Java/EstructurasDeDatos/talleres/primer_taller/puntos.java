package Java.EstructurasDeDatos.talleres.primer_taller;

public class puntos {
    matriz mtz = new matriz();

    public void Punto1() {
        // 1. Realice un algoritmo que almacene números en una matriz de 6 * 6. Imprimir
        // la suma de los números almacenados en la matriz.
        System.out.println("");
        suma_numeros_de_matriz sm = new suma_numeros_de_matriz();
        System.out.println("La suma de todos los elementos de la matriz es " + sm.sumar(mtz.crearMatriz(6)));
    }

    public void Punto2() {
        // 2.Realice un algoritmo que llene una matriz de 5 * 5 y determine la posición
        // [fila ,columna] del número mayor almacenado en la matriz. Los números son
        // diferentes.
        numero_mayor_fila_columna nm = new numero_mayor_fila_columna();
        nm.mayor(mtz.crearMatriz(5));
    }

    public void Punto3() {
        // 3.Realice un algoritmo que llene una matriz de 5 * 5. Calcular la suma de
        // cada fila y almacenarla en un vector, la suma de cada columna y almacenarla
        // en otro vector.
        separar_matriz sepMat = new separar_matriz();
        sepMat.sumaFilasYColumnas(mtz.crearMatriz(5));
    }

    public void Punto4() {
        // 4.Realice un algoritmo que llene una matriz de 10 * 10. Sumar las columnas e
        // imprimir que columna tuvo la máxima suma y la suma de esa columna
        separar_matriz sepMat = new separar_matriz();
        int listaCol[] = sepMat.sumaColumnas(mtz.crearMatriz(10));
        int mayor = 0;
        int posicion = 0;
        int index = 0;

        for (int i : listaCol) {
            index++;
            if (i > mayor) {
                mayor = i;
                posicion = index;
            }
            System.out.println("columna: " + index + " valor: " + i);
        }
        System.out.println("");
        System.out.println("La columna con la mayor suma es la " + posicion + " con un valor de " + mayor);
    }

    public void Punto5() {
        // 5.Realice un algoritmo que llene una matriz de 5 * 5 y que almacene toda la
        // matriz en un vector. Imprimir el vector resultante.
        matriz_a_vector mav = new matriz_a_vector();
        mav.imprimir_vector(mav.pasar_a_vector(mtz.crearMatriz(5)));
    }

    public void Punto6() {
        // 6.Realice un algoritmo que llene una matriz de 8 * 8, que almacene la suma de
        // las filas y la suma de las columnas en un vector. Imprimir el vector
        // resultante.
        matriz_a_vector mav = new matriz_a_vector();
        separar_matriz sm = new separar_matriz();
        suma_numeros_de_vector sv = new suma_numeros_de_vector();
        int vector[] = new int[2];
        int matriz[][] = mtz.crearMatriz(3);
        vector[0] = sv.sumar(sm.sumaColumnas(matriz));
        vector[1] = sv.sumar(sm.sumaFilas(matriz));
        mav.imprimir_vector(vector);
    }

    public void Punto7() {
        // 7.Realice un algoritmo que llene una matriz de 5 * 6 y que imprima cuantos de
        // los números almacenados son ceros, cuántos son positivos y cuantos son
        // negativos.
    }

    public void Punto8() {
        // 8.Diseñe un algoritmo que escriba el número de la fila cuya suma sea mayor
        // que las demás filas. Suponga que todas las filas suman diferente cantidad.
    }
}

public class puntos {
    matriz mtz = new matriz();

    public void Punto1() {
        // 1. Realice un algoritmo que almacene números en una matriz de 6 * 6. Imprimir
        // la suma de los números almacenados en la matriz.
        System.out.println("");
        sumaNumeros sm = new sumaNumeros();
        System.out.println("La suma de todos los elementos de la matriz es " + sm.sumar(mtz.crearMatriz(6)));
    }

    public void Punto2() {
        // 2.Realice un algoritmo que llene una matriz de 5 * 5 y determine la posición
        // [fila ,columna] del número mayor almacenado en la matriz. Los números son
        // diferentes.
        numeroMayorFilaColumna nm = new numeroMayorFilaColumna();
        nm.mayor(mtz.crearMatriz(5));
    }

    public void Punto3() {
        // 3.Realice un algoritmo que llene una matriz de 5 * 5. Calcular la suma de
        // cada fila y almacenarla en un vector, la suma de cada columna y almacenarla
        // en otro vector.
    }

    public void Punto4() {
        // 4.Realice un algoritmo que llene una matriz de 10 * 10. Sumar las columnas e
        // imprimir que columna tuvo la máxima suma y la suma de esa columna
    }

    public void Punto5() {
        // 5.Realice un algoritmo que llene una matriz de 5 * 5 y que almacene toda la
        // matriz en un vector. Imprimir el vector resultante.
    }

    public void Punto6() {
        // 6.Realice un algoritmo que llene una matriz de 8 * 8, que almacene la suma de
        // las filas y la suma de las columnas en un vector. Imprimir el vector
        // resultante.
    }

    public void Punto7() {
        // 7.Realice un algoritmo que llene una matriz de 5 * 6 y que imprima cuantos de
        // los números almacenados son ceros, cuántos son positivos y cuantos son
        // negativos.
    }

    public void Punto8() {
        // 8.Diseñe un pseudocódigo que escriba el número de la fila cuya suma sea mayor
        // que las demás filas. Suponga que todas las filas suman diferente cantidad.
    }
}

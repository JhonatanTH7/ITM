package JAVA.ejercicio_pilas;

import java.util.Scanner;
import java.util.Stack;;

public class index_pilas {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        ordenarPila op = new ordenarPila();
        pilaPares par = new pilaPares();
        pilaImpares impar = new pilaImpares();
        promedioPila pp = new promedioPila();
        menu menu = new menu();
        llenarPila llpil = new llenarPila();
        Stack<Integer> pila = new Stack<>();
        boolean a = true;
        System.out.println("Ingrese el numero de elementos n para la pila: ");
        int n = read.nextInt();
        pila = llpil.llenar(n);
        System.out.println(pila);
        try {
            while (a) {
                menu.mostrar();
                System.out.println("Ingrese el número de la opción deseada:");
                System.out.println("");
                String opcion = read.next();
                System.out.println("");
                read.nextLine(); // Para desaserse del caracter que deja haber leido antes
                switch (opcion) {
                    case "1":
                        pp.promedio(pila);
                        break;
                    case "2":
                        par.generarPila(pila);
                        break;
                    case "3":
                        impar.generarPila(pila);
                        break;
                    case "4":
                        op.ascendente(pila);
                        break;
                    case "5":
                        a = false;
                        break;
                    default:
                        System.out.println("Ingrese una opción valida");
                        break;
                }
                if (a) {
                    System.out.println("");
                    System.out.println("Presione enter para volver al menú...");
                    read.nextLine();
                }
            }
        } finally {
            read.close();
        }
    }
}
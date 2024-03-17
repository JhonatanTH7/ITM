package Java.EstructurasDeDatos.talleres.segundo_taller.src.Exercises.Exercise2;

import java.util.Scanner;
import java.util.Stack;

public class MainExercise2T2 {
    public void invertir() {
        //2) diseñar un método «invertir» que reciba una cadena de caracteres como parámetro. Esta
        //función deberá mostrar la cadena del revés. Se debe contar los caracteres de la cadena
        //Debes resolver el problema usando pila
        Scanner read = new Scanner(System.in);
        System.out.println("Enter a string");
        String text = read.nextLine();
        Stack<Character> reverseText = new Stack<>();
        for (char letter : text.toCharArray()) {
            reverseText.push(letter);
        }
        System.out.println("Number of characters: " + reverseText.size());
        while (!reverseText.isEmpty()) {
            System.out.print(reverseText.pop() + " ");
        }
        System.out.println(" ");
    }
}

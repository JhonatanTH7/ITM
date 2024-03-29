package Java.EstructurasDeDatos.talleres.segundo_taller.src;

import Java.EstructurasDeDatos.talleres.segundo_taller.src.Exercises.Exercise1.MainExercise1T2;
import Java.EstructurasDeDatos.talleres.segundo_taller.src.Exercises.Exercise2.MainExercise2T2;
import Java.EstructurasDeDatos.talleres.segundo_taller.src.Exercises.Exercise3.MainExercise3T2;
import Java.EstructurasDeDatos.talleres.segundo_taller.src.Exercises.Exercise4.MainExercise4T2;
import Java.EstructurasDeDatos.talleres.segundo_taller.src.Exercises.Exercise5.MainExercise5T2;
import Java.EstructurasDeDatos.talleres.segundo_taller.src.Exercises.Exercise6.MainExercise6T2;

import java.util.Scanner;

public class Options {
    public void mainOptions(Scanner read, String option) {
        switch (option) {
            case "0":
                System.out.println("See you next time!!!");
                break;
            case "1":
                MainExercise1T2 mainExercise1T2 = new MainExercise1T2();
                mainExercise1T2.exercise1();
                break;
            case "2":
                MainExercise2T2 mainExercise2T2 = new MainExercise2T2();
                mainExercise2T2.invertir(read);
                break;
            case "3":
                MainExercise3T2 mainExercise3T2 = new MainExercise3T2();
                mainExercise3T2.exercise3(read);
                break;
            case "4":
                MainExercise4T2 mainExercise4T2 = new MainExercise4T2();
                mainExercise4T2.exercise4();
                break;
            case "5":
                MainExercise5T2 mainExercise5T2 = new MainExercise5T2();
                mainExercise5T2.Exercise5(read);
                read.nextLine();// Desaserce de caracter invisible
                break;
            case "6":
                MainExercise6T2 mainExercise6T2 = new MainExercise6T2();
                mainExercise6T2.Exercise6();
                break;
            case "7":

                break;
            case "8":

                break;
            case "9":

                break;
            case "10":

                break;
            case "11":

                break;
            case "12":

                break;
            case "13":

                break;
            case "14":

                break;
            case "15":

                break;
            case "16":

                break;
            default:
                System.out.println("Not a valid option");
                break;
        }
        if (!option.equals("0")) {
            System.out.println(" ");
            System.out.println("Presione enter para volver al menú...");
            read.nextLine();
        }
    }
}
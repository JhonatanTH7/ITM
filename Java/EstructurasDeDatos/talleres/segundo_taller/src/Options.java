package Java.EstructurasDeDatos.talleres.segundo_taller.src;

import Java.EstructurasDeDatos.talleres.segundo_taller.src.Exercises.Exercise1.MainExercise1T2;

import javax.swing.*;

public class Options {
    public void mainOptions(String option) {
        switch (option) {
            case "0":
                JOptionPane.showMessageDialog(null, "See you next time!!!");
                break;
            case "1":
                MainExercise1T2 mainExercise1T2=new MainExercise1T2();
                mainExercise1T2.exercise1();
                break;
            case "2":

                break;
            case "3":

                break;
            case "4":

                break;
            case "5":

                break;
            case "6":

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
                JOptionPane.showMessageDialog(null, "Entered option is not valid, try again");
                break;
        }
    }
}
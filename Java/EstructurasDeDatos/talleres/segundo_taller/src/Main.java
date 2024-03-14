package Java.EstructurasDeDatos.talleres.segundo_taller.src;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Menu menu = new Menu();
        Options options = new Options();
        String option = "";
        try {
            do {
                option = menu.show(read);
                options.mainOptions(option);
            } while (!option.equals("0"));
        } finally {
            read.close();
        }
    }
}

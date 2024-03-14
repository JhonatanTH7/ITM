package Java.EstructurasDeDatos.talleres.segundo_taller.src;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner read = new Scanner(System.in)) {
            Menu menu = new Menu();
            Options options = new Options();
            String option = "";
            do {
                option = menu.show(read);
                options.mainOptions(option);
            } while (!option.equals("0"));
        }
    }
}

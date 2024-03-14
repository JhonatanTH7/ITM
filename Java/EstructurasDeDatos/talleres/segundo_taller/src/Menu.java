package Java.EstructurasDeDatos.talleres.segundo_taller.src;

import java.util.Scanner;

public class Menu {
    public String show() {
        Scanner read = new Scanner(System.in);
        String option = "";
        System.out.println("\n===== Menu =====\n");
        System.out.println("0. Finalizar");
        System.out.println("1. Exercise 1");
        System.out.println("2. Exercise 2");
        System.out.println("3. Exercise 3");
        System.out.println("4. Exercise 4");
        System.out.println("5. Exercise 5");
        System.out.println("6. Exercise 6");
        System.out.println("7. Exercise 7");
        System.out.println("8. Exercise 8");
        System.out.println("9. Exercise 8");
        System.out.println("10. Exercise 10");
        System.out.println("11. Exercise 11");
        System.out.println("12. Exercise 12");
        System.out.println("13. Exercise 13");
        System.out.println("14. Exercise 14");
        System.out.println("15. Exercise 15");
        System.out.println("16. Exercise 16\n\n");
        System.out.println("Enter an option: \n");
        option = read.next();
        System.out.println("\n");
        read.nextLine(); // Para desaserse del caracter que deja haber leido antes
        read.close();
        return option;
    }
}

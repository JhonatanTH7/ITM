import java.util.Scanner;;

public class index {
    public static void main(String[] args) {
        puntos pts = new puntos();
        Scanner read = new Scanner(System.in);
        boolean a = true;
        try {
            while (a) {
                System.out.println("");
                System.out.println("Ingrese el número de la opción deseada:");
                System.out.println("");
                System.out.println("1. Punto 1");
                System.out.println("2. Punto 2");
                System.out.println("3. Punto 3");
                System.out.println("4. Punto 4");
                System.out.println("5. Punto 5");
                System.out.println("6. Punto 6");
                System.out.println("7. Punto 7");
                System.out.println("8. Punto 8");
                System.out.println("9. Finalizar");
                System.out.println("");
                String opcion = read.next();
                System.out.println("");
                read.nextLine(); // Para desaserse del caracter que deja haber leido antes
                switch (opcion) {
                    case "1":
                        pts.Punto1();
                        break;
                    case "2":
                        pts.Punto2();
                        break;
                    case "3":
                        pts.Punto3();
                        break;
                    case "4":
                        pts.Punto4();
                        break;
                    case "5":
                        pts.Punto5();
                        break;
                    case "6":
                        pts.Punto6();
                        break;
                    case "7":
                        pts.Punto7();
                        break;
                    case "8":
                        pts.Punto8();
                        break;
                    case "9":
                        a = false;
                        break;
                    default:
                        System.out.println("Ingrese una opción valida");
                        System.out.println("");
                        System.out.println("Presione enter para volver al menú...");
                        read.nextLine();
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

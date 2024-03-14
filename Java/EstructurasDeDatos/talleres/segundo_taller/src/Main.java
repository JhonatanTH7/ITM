package Java.EstructurasDeDatos.talleres.segundo_taller.src;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Options options = new Options();
        String option = "";
        do {
            option = menu.show();
            options.mainOptions(option);
        } while (!option.equals("0"));
    }
}

package Java.EstructurasDeDatos.Utilities.ListMethods;

public class PrintList {

    public void printDoubleList(double[] list) {
        for (double j : list) {
            System.out.print((j) + " ");
        }
        System.out.println(" ");
    }

    public void printIntList(int[] list) {
        for (int j : list) {
            System.out.print(j + " ");
        }
        System.out.println(" ");
    }

    public void printStringList(String[] list) {
        for (String j : list) {
            System.out.print(j + " ");
        }
        System.out.println(" ");
    }

    public void printBooleanList(boolean[] list) {
        for (boolean j : list) {
            System.out.print(j + " ");
        }
        System.out.println(" ");
    }
}

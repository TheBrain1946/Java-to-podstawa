import java.util.Scanner;



public class Work16b {

    public static String pogoda;


    public static void main(String[] args) {
    zaptyajOPogode();
    czysc();
    wyswietlWprowadzonaPogode();
    }

    public static void zaptyajOPogode() {
        System.out.println("Jaka jest pogoda u cb,kolego");
        Scanner input = new Scanner(System.in);
        pogoda = input.nextLine();

    }

    public static void wyswietlWprowadzonaPogode() {
        System.out.println(pogoda);

    }

    public static void czysc() {
        pogoda = null;

    }
}
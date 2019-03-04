import java.util.Scanner;

public class HomeWork04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Podaj Kwotę ?");

        double kwota = input.nextInt();


        double euro = kwota * 4.2;


        double dolar = kwota * 3.8;


        double funt = kwota * 5.2;


        double korony = kwota * 0.58;


        System.out.println(euro + "\n" + dolar + "\n" + funt+ "\n" + korony);

        System.out.println("Koszt piwa w Dani 10 Koron\n");

        double piwo = 10.00;

        System.out.println("Czy stać cię na piwko w Dani\n");
        String wait = input.nextLine();

        boolean tak = kwota >= piwo;

        System.out.println(tak);


    }
}

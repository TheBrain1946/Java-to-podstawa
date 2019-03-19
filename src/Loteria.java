import java.util.Random;
import java.util.Scanner;

public class Loteria {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        Random random = new Random();

        int [] wprowadzona  = new int[6];
        System.out.println("Wprowadź 6 liczb od 1 do 24");

        for (int i = 0; i < wprowadzona.length ; i++ ){

            boolean nieprawidlowa;
            do {
                System.out.println("Wprowadź liczbe " + (i +1) );
                wprowadzona [i] = input.nextInt();
                 nieprawidlowa = wprowadzona [i] > 24 || wprowadzona [i] < 1;
                if(nieprawidlowa) {
                    System.out.println("#Wprowazono nieprawidłową liczbę.");
                }
                }while (nieprawidlowa );

        }System.out.print("Wybrane liczby :");
        for (int i : wprowadzona) {
            System.out.print(i+ " " );

        }
        int [] wylosowane = new int [6];

        System.out.println("\nWylosowane liczby ");
        for (int i = 0; i < wylosowane.length ; i++) {
            wylosowane [i] = random.nextInt(24) + 1;
            System.out.print(wylosowane [i] + " " );

        }

    }
}

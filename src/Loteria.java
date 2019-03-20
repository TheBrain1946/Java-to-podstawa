import java.util.Random;
import java.util.Scanner;

public class Loteria {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        Random random = new Random();

        int [] wprowadzone  = new int[6];
        System.out.println("Wprowadź 6 liczb od 1 do 24");

        for (int i = 0; i < wprowadzone.length ; i++ ){

            boolean nieprawidlowa;
            do {
                System.out.println("Wprowadź liczbe " + (i +1) );
                wprowadzone [i] = input.nextInt();
                 nieprawidlowa = wprowadzone [i] > 24 || wprowadzone [i] < 1;
                if(nieprawidlowa) {
                    System.out.println("#Wprowazono nieprawidłową liczbę.");
                }
                }while (nieprawidlowa );

        }System.out.print("Wybrane liczby :");
        for (int i : wprowadzone) {
            System.out.print(i+ " " );

        }
        int [] wylosowane = new int [6];

        System.out.println("\nWylosowane liczby ");
        for (int i = 0; i < wylosowane.length ; i++) {
            wylosowane [i] = random.nextInt(24) + 1;
            System.out.print(wylosowane [i] + " " );

        }
        int licznik = 0;

        for (int wylosowana  : wylosowane) {
            for (int wprowadzona  : wprowadzone) {
                if (wylosowana == wprowadzona) {
                    licznik++;
                    System.out.println("\nTrafiona liczba:" +wprowadzona);

                }
            }
        }
        System.out.println(licznik +" :Trafionych liczb");

        int nagorda =0;

        switch (licznik){
            case 0:
                nagorda = 0;
                break;
            case 1:
                nagorda = 0;
                break;
            case 2:
                nagorda = 0;
                break;
            case 3:
                nagorda = 16;
                break;
            case 4:
                nagorda = 200;
                break;
            case 5:
                nagorda = 4_000;
                break;
            case 6:
                nagorda = 1_500_000;
                break;
        }
        System.out.println("Twoja nagroda:" +nagorda+ "zł");
    }
}

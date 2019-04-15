package botAssistans;

import java.util.Random;
import java.util.Scanner;

public class Bot {
    public static Random random = new Random();
   public static Scanner input = new Scanner(System.in);
   public static String odpowiedz;
    public static void main(String[] args) {
        rozmawiaj();

}
    public static void rozmawiaj(){
        przywitaj();
        menu();
    }



    public static void przywitaj (){

        int wylosowane = random.nextInt(5) +1;
        switch (wylosowane){
            case 1:
                System.out.println("ELO");
          break;

            case 2:
                System.out.println("Witaj");
              break;
            case 3:
                System.out.println("Siema");
                break;
            case 4:
                System.out.println("YO BRO");
                break;
            case 5:
                System.out.println("Hello");
                break;

        }
        }

    public static void menu () {


        int wybor;
        do {
            clean();
            System.out.println("O co chciałbyś mnie zapytać człowieku ?");
            System.out.println("1. Co robisz");
            System.out.println("2. Zakończ rozmowe");
            wybor =input.nextInt();
            input.nextLine();
            switch (wybor) {
                case 1:

                    coRobisz();
                    break;

                default:
                    System.out.println("Zakończ rozmowę");


            }

        }

        while (wybor < 2 && wybor > 0 );

        }

    public static void coRobisz () {

       String [] tablica = new String[]{"Polski","Angielski","Hiszpański"};
       int numer = random.nextInt(tablica.length);

       System.out.println("Ucze się języka "+ tablica [numer] + "ego");

        String [] tablica2 = new String[]{"Jaki znasz synonim dla słowa \"miło\"","jak powiedzieć po angielsku,że coś nie wyszło?","jak pożegnałbyś kogoś po hiszpańsku?"};
        System.out.println(tablica2[numer]);


        odpowiedz = input.nextLine();

        System.out.println("Dzięki kolego");
    }

    public static void clean() {
        for (int i = 0; i < 25; i++) {

            System.out.println("\n");
        }

    }
    }



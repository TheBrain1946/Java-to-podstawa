import java.util.Random;
import java.util.Scanner;




public class Work10 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        String quest01 = "Jakiej metody używamy do porównywania Stringów";
        String answer01 = "1. .length()\n2. .compare()\n3. .equals()";
        String quest02 = "Co przechowuje zmienna referencyjna?";
        String answer02 ="1. adres obietku\n 2. obietk null\n 3. obiekt, dopiero gdy go do niej przypiszemy";
        String quest03 = "Z czego składa się obietk typu String?";
        String answer03 = "1. z listy znaków\n2. z ciągu znaków\n3. z tablicy znaków";
        String brav = "Brawo, dobra odpowiedź !";

        String end = "Niestety, 2 bledne odpowiedzi\n";
        int sum = 0;
        int cor = 3;
        int cor2 = 1;
        int cor3 = 3;

        int wynik = 0;


        System.out.println("Show zaczyna się za...");




        Random random = new Random();


        int range = random.nextInt(3) + 3 ;



        while (range > 0){
            System.out.println(range);
            --range;

            System.out.println("Naciśnij: <enter>");
            input.nextLine();
        }

        int licznik = 0;
        int liczba;
        do{
            System.out.println(quest01 +"\n"+ answer01);
            liczba = input.nextInt();
            ++licznik;
            //Sprawdzanie ile razy wykonała się zmienna   System.out.println("Licznik wynosi" + licznik);
        }while (cor != liczba && licznik < 2);


        if (liczba == cor){
            ++wynik;
            System.out.println(brav);
        }else {
            System.out.println(end);
        }

        licznik = 0;

        do{
            System.out.println(quest02 +"\n"+ answer02);
            liczba = input.nextInt();
            ++licznik;
        }while (cor2 != liczba && licznik < 2);


        if (liczba == cor2){
            System.out.println(brav);
            ++wynik;
        }else {
            System.out.println(end);
        }


        licznik = 0;

        do{
            System.out.println(quest03 +"\n"+ answer03);
            liczba = input.nextInt();
            ++licznik;
        }while (cor3 != liczba && licznik < 2);


        if (liczba == cor3){
            System.out.println(brav);
            ++wynik;
        }else {
            System.out.println(end);
        }


        System.out.println("Koniec quizu!\n Twój wynik:" + wynik );
    }
}

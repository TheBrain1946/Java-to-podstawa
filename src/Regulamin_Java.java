import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Regulamin_Java {
    public static void main(String[] args) {

/*
        Crtl + alt + L = Korekta tekstu
        Shift + F6 = Zamiana nazwy w całym kodzie
        Shift + F10 = Uruchomienie ostatniej konifguracji
        Shift + Ctrl + F10 = Odpalanie aktualnej classy
        Ctrl + Y = Kasowanie lini
        Shift + Ctrl + Arrow up/down = przesuwanie tekstu /kodu do góry/down
        Shift + Ctrl + Enter = Enter z formatowanie i uzupełnieniem
        Shift + Ctrl + / = komentowanie całego kodu
        Ctrl + / = Komentowanie wszystkiego pojedynczo
        Ctrl + Q = Wyświetlenie dokumentacji podgląd wartości
        Shift + Shift = wyszukiwanie all
        Ctrl + D = Kopia lini
        Alt + Insert = generwoanie metod
        Alt + Enter = Pomocna dłoń intelliJ
        fori = Generator skrótu (int i = 0; i < ; i++)

        */


        System.out.println("Lol");
        System.out.println("Lol\n"); // Dodaje Enter

        System.out.print("\tLol"); //Dodaje wcięcie

        System.out.println("Lol 'c:\\program file'"); //Pozwala używać znaków specjalnych

        System.out.println("\"Lol\""); // -||-


        int liczba; //Deklaracja samej zmienej


        liczba = 5; //Inicjalizacja liczby do zmienej

        liczba = liczba - 10; // To samo co niżej tylko że dłużej

        liczba -= 10; // Nadpisywanie zmienej

        liczba -= 1; //Dekrementacja

        liczba--; //Skrócona Dekrementacja wersja -1

        liczba += 1; //Inkrementacja

        liczba++; //Skrócona Inkrementacja +1

        String cokolwiek = "klowiek"; //Deklaracja i Incicjalizacja zmienej referencyjnej String

        cokolwiek += "milosc w zakopanem"; // Konkatenacja dodawnaie dwóch słów /Zdań

        boolean wartosc = false; //Deklaracja i Inicjalizacja wartości fasle

        boolean czyliczbadodatnia = liczba > 0; // Deklaracja i Inicjalizacja warunkiem


        boolean czyLiczaParzystaiDodatnia = liczba > 0 && liczba % 2 == 0; // Deklaracja i Inicjalizacja warunkiem rozbudowanym z wykrzoystaniem modulo "%" reszta z dzielenia 9/3

        //Najpopularniejsze bramki logiczne && - ||

        System.out.println(9 % 3);

        System.out.println(czyliczbadodatnia);

        System.out.println(cokolwiek);

        System.out.println(liczba);

        int zero = 0; // Deklaracja i inicializacja zmienej


        //Typy zmienych prymitywnych (ustalone z góry) = przechowywana w stacku "konkretna ilość wartość byte"

        /*int
          double
          float
          char
          long
          short
          byte
          boolean
         */

        // Typy zmienych referencyjnych (Nazwa bierze sie od nazwy classy) = przechowywana w stacku obiekty "Bez ograniczeń" HEAP=Miejsce przechowywania obkietów w jezyku JAVA.
        /*
        String
        Random
        Scanner
        int []
         */

        //Operatory Arytmetyczne

        //+ ,- , * ,/

        //Operatory Skróconej Inicializacji

      /*
        +=
        -=
        !=
        ==
        */


        Scanner input = new Scanner(System.in); // Scanner otrzymuje wejście do konsoli
/*
        System.out.println("Podaj liczbe gnoju");

        int gino = input.nextInt(); //Za każdym razem gdy wywoułjemy Scanner z Intem wstawiamy input.nextLine() aby zdjąc \n
        input.nextLine();

        System.out.println("Podaj nazwe pojazdu latającego");

        String drino = input.nextLine();

        System.out.println(gino + drino + "Gino");

        System.out.println("Podaj IMIĘ giono");
        String wow = input.nextLine();

        System.out.println(wow);*/


        Random random = new Random();
        System.out.println("Zapraszamy do Loteri 3. 2. .1");
        int losujemy = random.nextInt(); // losujemy meksyk  cały zakres int także liczby - minusowe
        System.out.println(losujemy);

        int los = random.nextInt(100) + 1; // Losowanie od 1 do 100
        System.out.println(los);


        //Instrukcje warunkowe

        if (losujemy > 0) {
            System.out.println("Liczba jest dodatnia");
        } else if (losujemy == 0) {
            System.out.println("Zero bro");
        } else {
            System.out.println("Ujemne");

        }

        if (los <= 30) {
            System.out.println("Liczba jest mnniejsza od 30");
        } else if (los < 60) {
            System.out.println("Liczba jest większa od 30 i mniejsza od 60");
        } else if (los < 90) {
            System.out.println("Liczba jest wieksza od 60 mniejsza od 90");
        } else {
            System.out.println("Większa niż 90");
        }

        boolean orzel = random.nextBoolean();
        System.out.println(orzel);


        if (orzel) {
            System.out.println("Orzeł");
        } else {
            System.out.println("Reszka");
        }

        /*
        for //Kiedy znamy zakres i jednocześnie potrzebujemy kontrolować zakres (kiedy trzeba wstawić coś do tablicy)
        */


        int[] tablica = new int[100];

        for (int i = 0; i < tablica.length; i++) {

            tablica[i] = random.nextInt(100);

            System.out.println(tablica[i]);

        }


        // Jeżeli chcemy mieć dostęp do danych do zbioru , używamy pętli for each |Dobry do znajdowania liczb I korzystania z IFem.



        /*
        for (int liczba2 : tablica ){

            System.out.println(liczba2);

        }
        */


        //For each kozak z IFem możemy łatwo znlaeźć jakąś liczbe lub Stringa.
        /*
        for (int liczba3 : tablica) {

            if (liczba3 == 14) {

                System.out.println("wyjazd");
                break;


            }
        }

        */

/*
         //Tablica String poszukująca wybranego słowa z użyczyciem FOR / IF EACH RICH

        String[] tablica2 = new String[5];

        tablica2[0] = "Pussy";
        tablica2[1] = "Nygga";
        tablica2[2] = "Love";
        tablica2[3] = "Extasy";
        tablica2[4] = "Chinse";

        // Dzięki mocy Equals możemy porównać do siebie dwa piękne Stringi , equal porównuje wartości obiektów a == porówna adresy pamięci.

        for (String slowo : tablica2) {

            if (slowo.equals("Pussy")) {

                System.out.println("I love pussy");
                    break;
            } else {
                System.out.println("LIPA");


            }

*/


        //Czytanie z pliku teksotowego za pomocą FILE /WHILE /Scanner

    /*    File garbaty = new File("Garbaty.txt");

        Scanner input2 = new Scanner(garbaty);


        while (input2.hasNextLine()) {
            System.out.println(input2.nextLine());

        */

/*
        int pin = 1234;
        int proby;
        int licznik = 0;
        do {

            System.out.println("Podaj 4 cyfrowy pin Łachmyto");
            proby = input.nextInt();
            licznik++;
        }
        while (proby != pin && licznik < 3);
        if (proby == pin) {
            System.out.println("Wchodzisz");

        } else {
            System.out.println("Fuck off");*/

        //Of topic SWITCH


        System.out.println("Witam, pierdze i znikam zaczynamy teleturniej bagieta");


        int costam;
        do {
            System.out.println("Podaj liczbe od 1 do 5");
            costam = input.nextInt();
            switch (costam) {

                case 1:
                    System.out.println("Kaszanka");
                    break;
                case 2:
                    System.out.println("Ser");
                    break;
                case 3:
                    System.out.println("Szynka");
                    break;
                case 4:
                    System.out.println("Złoto");
                    break;
                case 5:
                    System.out.println("Flaki");
                 default:
                     System.out.println("Pierwsiastek z szeiściu");

            }


        }while (costam != 3);


        System.out.println(costam);

        int [] tablic = new int [10];

        System.out.println((tablica == tablic));

    }
    }



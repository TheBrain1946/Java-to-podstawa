import java.util.Scanner;

public class HomeWork15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Wpisz ilość posiadasz punktów, aby sprawdzić swój poziom, Bohaterze:");
        int punkty = input.nextInt();

        int[] tablica = new int[10];


        for (int i = 1; i < tablica.length; i++) {
            tablica[i] = tablica[i - 1] + i * 250;
        }

        for (int liczba : tablica) {
            System.out.println(liczba);

        }
        int lvl = 0;

        for (int i = 1; i < tablica.length; i++) {
            if (punkty <= tablica[i]) {
                System.out.println("Twój poziom:" + i);
                break;
            }
        }
    }
}

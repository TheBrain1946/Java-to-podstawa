import java.util.Scanner;

public class HomeWork06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Poodaj sekundy");
        int sec = input.nextInt();
        System.out.println("Podano: "+ sec+ " sekund");

        int  min = sec / 60;
        int h = sec / 3600;

        System.out.println(min + " minut\n" + " " + h + " Godzin\n");

        boolean over = min >90;

        System.out.println("Wartość: " +over+"\n");

        if (min > 90){
            System.out.println("Przekracza dwie godziny lekcyjne | Zrobione na dwa sposoby");
        }else {
            System.out.println("Nie przekracza dwóch godzin lekyjnych");
        }
    }
}

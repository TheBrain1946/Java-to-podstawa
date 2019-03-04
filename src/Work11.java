import java.util.Scanner;


public class Work11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Podaj znak równania");
        String math = input.nextLine();
        char litera = math.charAt(0);

        System.out.println("Podaj 2 liczby");
        double liczba = input.nextDouble();
        System.out.println(liczba);

        double liczba2 = input.nextDouble();
        System.out.println(liczba2);

        switch (litera){
            case '*':
                System.out.println(liczba * liczba2);
                break;

            case '/':
                System.out.println(liczba / liczba2);
                break;

            case '-':
                System.out.println(liczba - liczba2);
                break;
            case '+':
                System.out.println(liczba + liczba2);
                break;
            case '^':

            case '%':
                System.out.println("Funkcja w budowie");
                break;
            default:
                System.out.println("Nie poprwany znak równania");

        }

    }
}

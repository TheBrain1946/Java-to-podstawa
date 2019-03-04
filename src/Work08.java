
import java.util.Random;
import java.util.Scanner;

public class Work08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj Liczbe kolego");
        int liczbe = input.nextInt();



        Random random = new Random();
        int K4 = random.nextInt(liczbe) +1;
        System.out.println(K4);;
    }
}

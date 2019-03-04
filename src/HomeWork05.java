import java.util.Scanner;

public class HomeWork05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Która godzina kolego ?");
        double time = input.nextInt();

        if (time <= 8.00) {
            System.out.println("Wstajemy Gnoju");
        }else if (time <20){
            System.out.println("Czas na obida robaczku ");
        }else{
            System.out.println("A Teraz rybka mówi dobranoc");
        }

    }
}

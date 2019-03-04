import java.util.Random;
import java.util.Scanner;


public class Work09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();


        System.out.println("Zgadnij liczbe od 1 do 10");


        int losowe = random.nextInt(10);
        int wprowadzona = input.nextInt();


        if (wprowadzona == losowe){
            System.out.println("Trafiłeś Gościu");

        }else if(wprowadzona > losowe){
            System.out.println("Za wysoko rybko");


        }else{
            System.out.println("Za nisko");
        }

    }

}

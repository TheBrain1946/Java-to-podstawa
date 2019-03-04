public class Work06_07 {
    public static void main(String[] args) {
        double waga = 107.0;
        double wzrost = 1.85;
        double wynik = waga/(wzrost*wzrost);
        boolean nadwaga = wynik >= 24.9;
        boolean niedowaga = wynik <=18.5;


        System.out.println("Wprowadzona waga:"+waga);
        System.out.println("Wprowadzona wzrost:"+wzrost);
        System.out.println(waga +"/"+wzrost +"^2="+wynik);
        System.out.println("nadwaga "+nadwaga);
        System.out.println("niedowaga "+niedowaga);
    }
}

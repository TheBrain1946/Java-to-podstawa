public class Work16a {
    public static void main(String[] args) {
      powiedzHelloWorld();
    }

    public static void powiedzHelloWorld() {
        System.out.println("Hello World");
        wyswietlUlubioneAdresyStron();

    }

    public static void wyswietlUlubioneAdresyStron() {
        System.out.println("www.google.com");
        policzDo10();

    }
    public static void policzDo10() {
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
        wyswietlAlfabet();

    }
    public static void wyswietlAlfabet() {
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.print (i);

        }
    }
}

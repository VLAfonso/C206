public class Main {
    public static void main(String[] args) {
        Contador1 c1 = new Contador1();
        Contador2 c2 = new Contador2();

        Thread th1 = new Thread(c1);
        Thread th2 = new Thread(c2);

        th1.start();
        th2.start();
    }
}

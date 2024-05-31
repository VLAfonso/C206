public class Contador1 implements Runnable{
    String nome = "contador1";

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Thread "+this.nome+" - Execução "+i);
        }
    }
}

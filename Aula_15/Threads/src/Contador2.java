public class Contador2 implements Runnable{
    String nome = "contador2";

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Thread "+this.nome+" - Execução "+i);
        }
    }
}

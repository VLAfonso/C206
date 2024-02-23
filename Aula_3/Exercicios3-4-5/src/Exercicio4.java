import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numAlunos;
        System.out.println("Entre com a quantidade de alunos: ");
        numAlunos = entrada.nextInt();

        switch (numAlunos){
            case 10, 20:
                System.out.println("A sala utilizada é a I-16.");
                break;
            case 30:
                System.out.println("A sala utilizada é a I-22.");
                break;
            default:
                System.out.println("Quantidade de alunos deve ser 10, 20 ou 30.");
        }

        entrada.close();
    }
}

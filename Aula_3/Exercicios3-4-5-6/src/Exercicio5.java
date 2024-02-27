import java.util.Random;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Random rand = new Random();
        int numGerado, numAdivinhado;

        numGerado = rand.nextInt(10) + 1;

        do{
            System.out.println("Qual o número estou pensando?");
            numAdivinhado = entrada.nextInt();

            if(numAdivinhado != numGerado){
                System.out.println("Errou!");
            }
        } while (numGerado != numAdivinhado);

        System.out.println("Parabéns! Você acertou meu número!");

        entrada.close();
    }
}

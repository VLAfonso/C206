import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int np3, npa;

        System.out.println("Digite a nota NPA: ");
        npa = entrada.nextInt();

        if (npa >= 60) {
            System.out.println("Deu bom!");
        } else {
            System.out.println("Ainda tem como...");

            System.out.println("Digite a nota NP3: ");
            np3 = entrada.nextInt();

            if ((np3+npa)/2 >= 50) {
                System.out.println("Deu bom!");
            } else {
                System.out.println("Até semestre que vem.");
            }
        }

        entrada.close();
    }
}

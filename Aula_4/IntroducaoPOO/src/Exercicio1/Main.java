package Exercicio1;

public class Main {
    public static void main(String[] args) {
        Zumbi zumbi = new Zumbi();
        zumbi.forca = 100;
        zumbi.vida = 200;
        zumbi.altura = 1.50f;
        zumbi.nome = "Chris";

        Zumbi zumbi2 = new Zumbi();
        zumbi2.nome = "Lara";

        System.out.println("O nome do zumbi é "+zumbi.nome);
        System.out.println("O nome do zumbi é "+zumbi2.nome);
        zumbi.andar();
        zumbi.seAlimentar();

        zumbi.iniciar();
        System.out.println("O nome do zumbi é "+zumbi.nome);
    }
}

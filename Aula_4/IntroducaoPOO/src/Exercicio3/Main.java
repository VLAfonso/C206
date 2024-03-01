package Exercicio3;

public class Main {
    public static void main(String[] args) {
        //Criar dois zumbis
        Zumbi zumbi1 = new Zumbi();
        Zumbi zumbi2 = new Zumbi();

        //Manipular suas vida
        zumbi1.vida = 300;
        zumbi2.vida = 567.8;

        //Igualar os dois
        zumbi1 = zumbi2;

        //Alterar suas vidas e mostrar
        zumbi1.vida = 320;
        zumbi2.vida = 678.9;
        System.out.println("A vida do zumbi1 é: "+zumbi1.mostraVida());
        System.out.println("A vida do zumbi2 é: "+zumbi2.mostraVida());
    }
}

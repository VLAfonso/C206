package Exercicio4;

public class Main {
    public static void main(String[] args) {
        //Criar 2 zumbis
        Zumbi zumbi1 = new Zumbi();
        zumbi1.vida = 1000;
        zumbi1.nome = "Zoo";
        Zumbi zumbi2 = new Zumbi();
        zumbi2.vida = 5320.4;
        zumbi2.nome = "Zaz";

        //Transferir vida do zumbi1 pro 2 mostrar suas vidas
        System.out.println("A vida de "+zumbi1.nome+" é "+ zumbi1.mostraVida());
        System.out.println("A vida de "+zumbi2.nome+" é "+zumbi2.mostraVida());
        if(zumbi1.transfereVida(zumbi2, 20.1)) {
            System.out.println("A vida de " + zumbi1.nome + " é " + zumbi1.mostraVida());
            System.out.println("A vida de " + zumbi2.nome + " é " + zumbi2.mostraVida());
        }
        else{
            System.out.println("Vida insuficiente!");
        }
        if(zumbi1.transfereVida(zumbi2, 3098.87)) {
            System.out.println("A vida de " + zumbi1.nome + " é " + zumbi1.mostraVida());
            System.out.println("A vida de " + zumbi2.nome + " é " + zumbi2.mostraVida());
        }
        else{
            System.out.println("Vida insuficiente!");
        }
    }
}

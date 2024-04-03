package br.inatel.cdg;

import br.inatel.cdg.inimigo.Asteroide;
import br.inatel.cdg.jogador.Nave;

public class Main {
    public static void main(String[] args) {
        //Criar duas naves
        Nave nave1 = new Nave("Navezinha", 1000, "Normal");
        Nave nave2 = new Nave("Navezona", 2500, "Explosivo");

        //Criar dois asteroides
        Asteroide ast1 = new Asteroide("Asteroidezinho", "Pequeno");
        Asteroide ast2 = new Asteroide("Asteroidezão", "Grande");

        //Naves atirarem nos asteroides
        System.out.println(nave1.getNome()+" atirando!");
        System.out.println("Atirando em "+ast1.getNome()+"...");
        nave1.atirar(ast1);
        System.out.println("Atirando em "+ast2.getNome()+"...");
        nave1.atirar(ast2);
        System.out.println("\n"+nave2.getNome()+" atirando!");
        System.out.println("Atirando em "+ast1.getNome()+"...");
        nave2.atirar(ast1);
        System.out.println("Atirando em "+ast2.getNome()+"...");
        nave2.atirar(ast2);


    }
}

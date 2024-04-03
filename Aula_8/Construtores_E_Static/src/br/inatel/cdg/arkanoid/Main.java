package br.inatel.cdg.arkanoid;

import br.inatel.cdg.arkanoid.jogador.Jogador;
import br.inatel.cdg.arkanoid.objeto.Bloco;

public class Main {
    public static void main(String[] args) {
        //Criar jogador
        Jogador jogador1 = new Jogador("Vivis");

        //Criar 15 blocos
        Bloco[] blocos = new Bloco[20];
        for(int i=0; i< 15; i++){
            blocos[i] = new Bloco();
        }

        //Mostrar quantidade de blocos no início
        System.out.println("Há um total de "+Bloco.getTotalBlocos()+" blocos.");
        System.out.println("Há "+Bloco.getNumBlocosDestruidos()+" blocos destruídos.");

        //Destruir 4 blocos
        jogador1.destruir(blocos[2]);
        jogador1.destruir(blocos[14]);
        jogador1.destruir(blocos[7]);
        jogador1.destruir(blocos[9]);
        System.out.println("Há um total de "+Bloco.getTotalBlocos()+" blocos.");
        System.out.println("Há "+Bloco.getNumBlocosDestruidos()+" blocos destruídos.");

        //Criar mais 5 blocos
        for(int i=15; i< blocos.length; i++){
            blocos[i] = new Bloco();
        }
        System.out.println("Há um total de "+Bloco.getTotalBlocos()+" blocos.");
        System.out.println("Há "+Bloco.getNumBlocosDestruidos()+" blocos destruídos.");

        //Tentar destruir um bloco já destruído
        jogador1.destruir(blocos[7]);
        System.out.println("Há um total de "+Bloco.getTotalBlocos()+" blocos.");
        System.out.println("Há "+Bloco.getNumBlocosDestruidos()+" blocos destruídos.");

        //Mostrar pontuação e moedas do jogador
        System.out.println("A pontuação de "+jogador1.getNome()+" é: "+jogador1.getPontuacao()+" pontos.");
        jogador1.numMoedas();

    }
}

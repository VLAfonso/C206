package br.inatel.cdg.arkanoid.jogador;

import br.inatel.cdg.arkanoid.objeto.Bloco;

public class Jogador {
    //Atributos do jogador
    private String nome;
    private int pontuacao;

    //Construtor do jogador
    public Jogador(String nome) {
        this.nome = nome;
        this.pontuacao = 0;
    }

    //Destruir bloco
    public void destruir(Bloco bloco){
        if(!bloco.isDestruido()){
            this.pontuacao++;
            bloco.destruir();
            System.out.println("Bloco destruído com sucesso por "+this.nome+"!");
        }
        else{
            System.out.println("Bloco já destruído!");
        }
    }

    //Converter pontos em moedas
    public void numMoedas(){
        int moedas = Conversor.converte(this.pontuacao);
        System.out.println("O número de moedas de "+this.nome+" é "+moedas+" moedas.");
    }

    public String getNome() {
        return nome;
    }

    public int getPontuacao() {
        return pontuacao;
    }
}

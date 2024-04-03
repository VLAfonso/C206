package br.inatel.cdg.jogador;

import br.inatel.cdg.inimigo.Asteroide;

public class Nave {
    //Atributos da nave
    private String nome;
    private double vida;
    private  String tipoTiro;

    //Contrutor da nave
    public Nave(String nome, double vida, String tipoTiro){
        this.nome = nome;
        this.vida = vida;
        this.tipoTiro = tipoTiro;
    }

    //
    public void atirar(Asteroide ast){
        if((ast.getTipoAsteroide().equals("Grande"))&&(this.tipoTiro.equals("Normal"))){
            System.out.println("Tiro muito fraco para esse asteroide!");
        }
        else{
            ast.destruir();
        }
    }

    public String getNome() {
        return nome;
    }

    public double getVida() {
        return vida;
    }
}

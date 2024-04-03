package br.inatel.cdg.inimigo;

public class Asteroide {
    //Atributos do asteroide
    private String nome;
    private String tipoAsteroide;

    //Construtor do asteroide
    public Asteroide(String nome, String tipoAsteroide) {
        this.nome = nome;
        this.tipoAsteroide = tipoAsteroide;
    }

    public String getTipoAsteroide() {
        return tipoAsteroide;
    }

    public String getNome() {
        return nome;
    }

    //Destruir asteroide
    public void destruir(){
        System.out.println("Asteroide "+this.nome+" destruído!");
    }
}

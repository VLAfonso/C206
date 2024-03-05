package Exercicio5;

public class Personagem {
    String nome;
    int pontos;
    Arma arma;

    void usarArma(){
        arma.resistencia -= 2;
    }

    void tomarDano(){
        this.pontos -= 5;
    }
}

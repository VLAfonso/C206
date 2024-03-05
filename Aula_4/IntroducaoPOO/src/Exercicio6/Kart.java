package Exercicio6;

public class Kart {
    String nome;
    Piloto piloto;
    Motor motor;

    public Kart(){
        motor = new Motor();
    }

    void pular(){
        System.out.println(this.nome+" pulou!");
    }

    void soltarTurbo(){
        System.out.println("Vruuuum! "+this.nome+" soltou o tuuurbo!");
    }

    void fazerDrift(){
        System.out.println(this.nome+" fez drift!");
    }
}

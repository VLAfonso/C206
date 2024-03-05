package Exercicio4;

public class Zumbi {
    double vida;
    String nome;

    double mostraVida(){
        return this.vida;
    }

    boolean transfereVida(Zumbi zumbiAlvo, double quantia){
        if(this.vida >= quantia){
            vida -= quantia;
            zumbiAlvo.vida += quantia;
            return true;
        }
        else
            return false;
    }
}

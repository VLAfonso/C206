package Exercicio5;

public class Main {
    public static void main(String[] args) {
        Personagem personagem1 = new Personagem();
        personagem1.nome = "Vivis";

        Arma arma1 = new Arma();
        arma1.nome = "Arco";

        //Agregar a arma ao personagem
        personagem1.arma = arma1;
    }
}

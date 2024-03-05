package Exercicio6;

public class Motor {
    String cilindradas;
    float velocidadeMaxima;

    void mostraInfo(){
        System.out.println("O motor possui:\n"+this.cilindradas+" cilindradas;");
        System.out.println(this.velocidadeMaxima+"km/h de velocidade máxima.");
    }
}

package Exercicio1;

public class Zumbi {

    String nome;
    float altura;
    int vida;
    int forca;

    void iniciar(){
        vida = 100;
        nome = "Anna";
        altura = 1.40f;
        forca = 999999;
    }

    void andar(){
        System.out.println("Zumbi andando...");
    }

    void seAlimentar(){
        System.out.println("Zumbi se alimentando...");
    }
}

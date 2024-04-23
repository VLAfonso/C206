package Exercicio;

public class Lontra extends Mamifero implements Aquatico {
    //Construtor da lontra
    public Lontra(String nome, double vida) {
        super(nome, vida);
    }

    //Emitir som
    @Override
    public void emitirSon() {
        System.out.println("Barulho de lontra... Iriri");
    }

    @Override
    public void nadar() {
        System.out.println(this.nome+" está nadando!");
    }
}

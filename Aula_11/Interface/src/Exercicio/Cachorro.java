package Exercicio;

public class Cachorro extends Mamifero {
    //Construtor do cachorro
    public Cachorro(String nome, double vida) {
        super(nome, vida);
    }

    //Emitir som
    @Override
    public void emitirSon() {
        System.out.println("Barulho de cachorro... Au au");
    }
}

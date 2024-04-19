public class Boi extends Mamifero{
    //Construtor do boi
    public Boi(String nome, double vida) {
        super(nome, vida);
    }

    //Emitir som
    @Override
    public void emitirSon() {
        System.out.println("Barulho de boi... Muuu");
    }
}

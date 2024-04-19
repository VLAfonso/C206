public class Lontra extends Mamifero{
    //Construtor da lontra
    public Lontra(String nome, double vida) {
        super(nome, vida);
    }

    //Emitir som
    @Override
    public void emitirSon() {
        System.out.println("Barulho de lontra... Iriri");
    }
}

public abstract class Mamifero {
    //Atributos de mamífero
    protected String nome;
    protected double vida;

    //Construtor do mamífero
    public Mamifero(String nome, double vida) {
        this.nome = nome;
        this.vida = vida;
    }

    //Emitir som
    public abstract void emitirSon();

    //Mostrar informações do mamífero
    public void mostraInfo(){
        System.out.println("Informações do mamífero:");
        System.out.println("Nome: "+this.nome);
        System.out.println("Vida: "+this.vida);
    }
}

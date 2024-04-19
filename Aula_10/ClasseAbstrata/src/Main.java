public class Main {
    public static void main(String[] args) {
        //Criar cachorro, lontra e boi
        Cachorro cachorro = new Cachorro("Scooby", 250);
        Lontra lontra = new Lontra("Mupi", 175);
        Boi boi = new Boi("Walace", 500);

        //Mostrar informações e emitir som de cada mamífero
        cachorro.mostraInfo();
        cachorro.emitirSon();
        System.out.println();
        lontra.mostraInfo();
        lontra.emitirSon();
        System.out.println();
        boi.mostraInfo();
        boi.emitirSon();
    }
}

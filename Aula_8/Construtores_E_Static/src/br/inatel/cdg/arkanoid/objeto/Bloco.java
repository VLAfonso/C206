package br.inatel.cdg.arkanoid.objeto;

public class Bloco {
    private static int totalBlocos = 0; //contabilizar núm de blocos no jogo
    private static int numBlocosDestruidos = 0; //contabilizar num de blocos destruidos
    private boolean destruido;

    //Construtor do Bloco
    public Bloco() {
        totalBlocos++; //Adicionar um bloco ao jogo
        this.destruido = false;
    }

    //Destruir bloco
    public void destruir(){
        numBlocosDestruidos++;
        this.destruido = true;
    }

    public static int getTotalBlocos() {
        return totalBlocos;
    }

    public static int getNumBlocosDestruidos() {
        return numBlocosDestruidos;
    }

    public boolean isDestruido() {
        return destruido;
    }
}

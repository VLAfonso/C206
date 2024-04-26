package Exercicio2;

public abstract class ClasseMae implements Comparable <ClasseMae> {
    //Atributos da classe
    private String texto;
    private int numero;

    //Construtor da classe
    public ClasseMae(String texto, int numero) {
        this.texto = texto;
        this.numero = numero;
    }

    //Comparar o numero para ordenar
    @Override
    public int compareTo(ClasseMae o) {
        return Integer.compare(o.getNumero(), this.numero);
    }

    //Getters
    public String getTexto() {
        return texto;
    }

    public int getNumero() {
        return numero;
    }
}

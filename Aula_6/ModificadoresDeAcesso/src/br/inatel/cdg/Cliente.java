package br.inatel.cdg;

public class Cliente {
    //Atributos do cliente
    private String nome;
    private long cpf;

    //Criar getter e setter para nome e cpf
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }
    public void setCpf(long cpf) {
        this.cpf = cpf;
    }
}

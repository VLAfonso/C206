package Exercicio2;

public class Cliente {
    //Atributos do cliente
    private String nome;
    private long cpf;

    //Construtor do cliente
    public Cliente(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    //Mostrar informações do cliente
    void mostraInfo(){
        System.out.println("Nome: "+this.nome);
        System.out.println("CPF: "+this.cpf);
    }

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

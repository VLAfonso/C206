package br.inatel.cdg;

public class Conta {
    //Atributos da conta
    private int numero;
    private float saldo;
    private float limite;
    private Cliente[] titulares = new Cliente[3];

    //Criar construtor da conta
    public Conta(Cliente[] titulares) {
        setTitulares(titulares);
    }


    //Sacar dinheiro da conta
    public void sacar(float quantia){
        if(quantia <= this.saldo){
            this.saldo -= quantia;
            System.out.println("Saque de R$"+quantia+" realizado com sucesso!");
        }
        else {
            System.out.println("Saldo insuficiente!");
        }
    }

    //Depositar dinheiro na conta
    public void deposita(float quantia){
        this.saldo += quantia;
        System.out.println("Depósito de R$"+quantia+" realizado com sucesso!");
    }

    //Criar getters e setters
    public float getSaldo() {
        return saldo;
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getLimite() {
        return limite;
    }
    public void setLimite(float limite) {
        this.limite = limite;
    }

    public Cliente[] getTitulares() {
        return titulares;
    }
    public void setTitulares(Cliente[] titulares) {
        this.titulares = titulares;
    }
}

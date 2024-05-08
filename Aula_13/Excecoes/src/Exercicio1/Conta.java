package Exercicio1;

import java.util.HashSet;
import java.util.Set;

public class Conta {
    //Atributos da conta
    private int numero;
    private float saldo;
    private float limite;
    private Set<Cliente> titulares = new HashSet<>();

    //Criar construtor da conta
    public Conta(int numero, float saldo, float limite, Set<Cliente> titulares) {
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
        this.titulares = titulares;
    }

    //Mostrar informações da conta
    void mostraInfo(){
        System.out.println("O número da conta é: "+this.numero);
        System.out.println("O saldo da conta é: R$"+this.saldo);
        System.out.println("O limite da conta é: R$"+this.limite);
        if(titulares!=null){
            System.out.println("Os titulares são:");
            for(Cliente t :titulares){
                try {
                    t.mostraInfo();
                }
                catch (NullPointerException e){
                    System.out.println("Cliente nulo!");
                }
            }
        }
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

    public Set<Cliente> getTitulares() {
        return titulares;
    }

    public void setTitulares(Set<Cliente> titulares) {
        this.titulares = titulares;
    }
}

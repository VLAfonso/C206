package Exercicio2;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //Criar 1 cliente
        Cliente cliente = new Cliente("Regina", 4567890);

        //Criar um HashSet de clientes e adicionar clientes
        Set<Cliente> titulares = new HashSet<>();
        titulares.add(cliente);

        //Criar conta e adicionar titulares
        Conta conta = new Conta(18, 10000.01f,999999.88f, titulares);

        //Mostrar informações da conta
        conta.mostraInfo();

        //Tentar sacar um valor válido
        try {
            conta.sacar(1000);
            conta.sacar(9200);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
    }
}

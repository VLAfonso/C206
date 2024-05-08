package Exercicio1;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //Criar 2 clientes
        Cliente cliente1 = new Cliente("Regina", 4567890);
        Cliente cliente2 = new Cliente("Alberto", 987659);

        //Criar 1 cliente nulo
        Cliente cliente3 = null;

        //Criar um HashSet de clientes e adicionar clientes
        Set<Cliente> titulares = new HashSet<>();
        titulares.add(cliente1);
        titulares.add(cliente2);
        titulares.add(cliente3);

        //Criar conta e adicionar titulares
        Conta conta = new Conta(18, 10000.01f,999999.88f, titulares);

        //Mostrar informações da conta
        conta.mostraInfo();

        //Mostrar final da execução
        System.out.println("Código finalizado!");
    }
}

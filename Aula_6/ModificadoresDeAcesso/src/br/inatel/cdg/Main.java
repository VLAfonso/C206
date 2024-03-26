package br.inatel.cdg;

public class Main {
    public static void main(String[] args) {
        //Criar um cliente
        Cliente[] clientes = new Cliente[2];
        clientes[0] = new Cliente();
        clientes[0].setNome("Céres Regina");
        clientes[0].setCpf(563567898);

        //Criar uma conta
        Conta conta = new Conta(clientes);
        conta.setNumero(18);
        conta.setLimite(10000);

        //Mostrar saldo da conta
        System.out.println("O saldo da conta é de R$"+conta.getSaldo());

        //Tentar sacar 100 e mostrar saldo
        conta.sacar(100);
        System.out.println("O saldo da conta é de R$"+conta.getSaldo());

        //Depositar 1410,50 e mostrar saldo
        conta.deposita(1410.50f);
        System.out.println("O saldo da conta é de R$"+conta.getSaldo());

        //Sacar 320 e mostrar saldo
        conta.sacar(320);
        System.out.println("O saldo da conta é de R$"+conta.getSaldo());
    }
}

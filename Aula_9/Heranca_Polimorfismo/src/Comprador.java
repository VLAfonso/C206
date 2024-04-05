public class Comprador {
    private String nome;
    private double saldo;

    //Construtor do comprador
    public Comprador(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    //Comprar brownie
    public void efetuarCompra(Brownie brownie){
        if(saldo >= brownie.getPreco()){
            System.out.println(this.nome+" comprando "+brownie.getNome());
            brownie.addCarrinhoDeCompras();
            brownie.calculaValorTotalCompra();
            saldo -= brownie.getPreco();
        }
        else {
            System.out.println(this.nome+" possui saldo insuficiente para comprar "+brownie.getNome());
        }
    }
}

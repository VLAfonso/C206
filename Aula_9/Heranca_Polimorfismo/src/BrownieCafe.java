public class BrownieCafe extends Brownie {
    //Construtor do brownie de café
    public BrownieCafe(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    //Adicionar mais café ao brownie
    public void adicionaCafe(){
        System.out.println("Mais café adicionado ao brownie!");
    }

    @Override
    public void addCarrinhoDeCompras(){
        System.out.println("O brownie de café foi adicionado ao carrinho de compras!");
    }
}

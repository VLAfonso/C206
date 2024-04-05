public class BrownieDoceDeLeite extends Brownie {
    //Construtor do brownie de doce de leite
    public BrownieDoceDeLeite(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    //Adicionar mais doce de leite ao brownie
    public void adicionaDoceDeLeite(){
        System.out.println("Mais doce de leite adicionado ao brownie!");
    }

    @Override
    public void addCarrinhoDeCompras(){
        System.out.println("O brownie de doce de leite foi adicionado ao carrinho de compras!");
    }
}

public class BrownieNutella extends Brownie {
    //Construtor do brownie de nutella
    public BrownieNutella(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    //Adicionar mais nutella ao brownie
    public void adicionaNutella(){
        System.out.println("Mais Nutella adicionada ao brownie!");
    }

    @Override
    public void addCarrinhoDeCompras(){
        System.out.println("O brownie de Nutella foi adicionado ao carrinho de compras!");
    }
}

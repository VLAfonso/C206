public class Brownie {
    protected String nome;
    protected double preco;
    protected String sabor;

    //Construtor do brownie
    public Brownie(java.lang.String nome, double preco, java.lang.String sabor) {
        this.nome = nome;
        this.preco = preco;
        this.sabor = sabor;
    }

    //Adicionar brownie ao carrinho de compras
    public void addCarrinhoDeCompras(){
        System.out.println(this.nome+" adicionado ao carrinho de compras!");
    }

    //Calcular valor total da compra
    public void calculaValorTotalCompra(){
        System.out.println("O total da compra de "+this.nome+" foi de R$"+this.preco);
    }

    //Mostrar informações do Brownie
    public void mostraInfo(){
        System.out.println("O nome do brownie é: "+this.nome);
        System.out.println("O preço do brownie é: R$"+this.preco);
        System.out.println("O sabor do brownie é: "+this.sabor);
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}

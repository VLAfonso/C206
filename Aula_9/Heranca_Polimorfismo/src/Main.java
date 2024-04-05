public class Main {
    public static void main(String[] args) {
        //Criar brownies de cada sabor
        BrownieNutella bNutella = new BrownieNutella("Brownie de Nutella", 10, "Nutella");
        BrownieDoceDeLeite bDoceDeLeite = new BrownieDoceDeLeite("Brownie de Doce de Leite", 7.5, "Doce de Leite");
        BrownieCafe bCafe = new BrownieCafe("Brownie de Café", 9, "Café");

        //Mostrar informações, adicionar mais recheio, adicionar ao carrinho e mostrar valor total da compra
        //Brownie de Nutella
        bNutella.mostraInfo();
        bNutella.adicionaNutella();
        bNutella.addCarrinhoDeCompras();
        bNutella.calculaValorTotalCompra();
        System.out.println();
        //Brownie de doce de leite
        bDoceDeLeite.mostraInfo();
        bDoceDeLeite.adicionaDoceDeLeite();
        bDoceDeLeite.addCarrinhoDeCompras();
        bDoceDeLeite.calculaValorTotalCompra();
        System.out.println();
        //Brownie de café
        bCafe.mostraInfo();
        bCafe.adicionaCafe();
        bCafe.addCarrinhoDeCompras();
        bCafe.calculaValorTotalCompra();
        System.out.println();

        //Criar um comprador
        Comprador comprador = new Comprador("Vivis", 20);

        //Comprar um brownie de cada
        comprador.efetuarCompra(bNutella);
        System.out.println();
        comprador.efetuarCompra(bDoceDeLeite);
        System.out.println();
        comprador.efetuarCompra(bCafe);
    }
}

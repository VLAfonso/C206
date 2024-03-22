public class Cliente {
    //Atributos do cliente
    String nome;
    long cpf;
    Computador[] computadores = new Computador[10];

    //Calcular total da compra
    float calculaTotalCompra(){
        float total = 0;
        for(int i=0; i<computadores.length; i++){
            if(computadores[i] != null){
                total += computadores[i].preco;
            }
        }
        return total;
    }
}

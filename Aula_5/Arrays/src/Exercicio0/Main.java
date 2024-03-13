package Exercicio0;

public class Main {
    public static void main(String[] args) {
        //Criar cantina do Inatel
        Cantina cantinaInatel = new Cantina();
        cantinaInatel.nome = "Cantina do Inatel";

        //Criar três salgados
        Salgado coxinha = new Salgado();
        coxinha.nome = "Coxinha";
        Salgado esfirra = new Salgado();
        esfirra.nome = "Esfirra";
        Salgado bQueijo = new Salgado();
        bQueijo.nome = "Bolinha de Queijo";

        //Adicionar salgados na cantina
        cantinaInatel.addSalgado(coxinha);
        cantinaInatel.addSalgado(esfirra);
        cantinaInatel.addSalgado(bQueijo);

        //Mostrar informações da cantina
        cantinaInatel.mostraInfo();
    }
}

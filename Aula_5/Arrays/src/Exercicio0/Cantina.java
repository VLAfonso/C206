package Exercicio0;

public class Cantina {
    String nome;
    Salgado[] salgados = new Salgado[20];
    int quantidade = 0;

    /*
    void addSalgado(Salgado novoSalgado){
        this.salgados[this.quantidade] = novoSalgado;
        this.quantidade += 1;
    }*/

    //Método visto na aula
    void addSalgado(Salgado novoSalgado){
        for(int i=0; i < salgados.length; i++){
            if(salgados[i] == null){
                salgados[i] = novoSalgado;
                break;
            }
        }
    }

    void mostraInfo(){
        System.out.println("O nome da cantina é: "+this.nome);
        System.out.println("Ela possui os salgados:");
        for(Salgado salgado : salgados){
            if(salgado != null)
                System.out.println(" - "+salgado.nome);
        }
    }
}

package Exercicio0;

public class Cantina {
    String nome;
    Salgado[] salgados = new Salgado[20];
    int quantidade = 0;

    void addSalgado(Salgado novoSalgado){
        this.salgados[this.quantidade] = novoSalgado;
        this.quantidade += 1;
    }

    void mostraInfo(){
        System.out.println("O nome da cantina é: "+this.nome);
        System.out.println("Ela possui os salgados:");
        for(Salgado salgado : salgados){
            if(salgado == null)
                break;
            else
                System.out.println(" - "+salgado.nome);
        }
    }
}

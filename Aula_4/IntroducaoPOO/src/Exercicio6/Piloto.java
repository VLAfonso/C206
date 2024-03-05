package Exercicio6;

public class Piloto {
    String nome;
    boolean vilao;

    void soltaSuperPoder(){
        if(vilao){
            System.out.println(this.nome+" soltou seu super poder e massacrou a humanidade!");
        }
        else {
            System.out.println(this.nome+" soltou seu super poder e salvou a humanidade!");
        }

    }
}

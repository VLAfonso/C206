package Exercicio2;

public class CifraDeCesar {
    //Criptografar cifra
    public String criptografar(String frase, int cifra){
        //Transformar os caracteres em ascii
        byte[] asciiFrase = frase.getBytes();

        //Criptografar baseado na cifra
        for(int i=0; i<asciiFrase.length; i++){
            //Verificar se é letra maiúscula
            if((asciiFrase[i]>=65) && (asciiFrase[i]<=90)) {
                asciiFrase[i] += (byte) cifra;
                //Voltar ao início do alfabeto se passar de Z
                if(asciiFrase[i]>90){
                    asciiFrase[i] -= 26;
                }
            } else
                //Verificar se é letra minúscula
                if ((asciiFrase[i]>=97) && (asciiFrase[i]<=122)) {
                    asciiFrase[i] += (byte) cifra;
                    //Voltar ao início do alfabeto se passar de z
                    if(asciiFrase[i]>122){
                        asciiFrase[i] -= 26;
                    }
                }
        }
        //Transformar a frase criptografada de ascii para string e retornar
        return new String(asciiFrase);
    }

    //Descriptografar cifra
    public String descriptografar(String frase, int cifra){
        //Transformar os caracteres em ascii
        byte[] asciiFrase = frase.getBytes();

        //Deriptografar baseado na cifra
        for(int i=0; i<asciiFrase.length; i++){
            //Verificar se é letra maiúscula
            if((asciiFrase[i]>=65) && (asciiFrase[i]<=90)) {
                asciiFrase[i] -= (byte) cifra;
                //Ir para o final do alfabeto se passar de A
                if(asciiFrase[i]<65){
                    asciiFrase[i] += 26;
                }
            } else
                //Verificar se é letra minúscula
                if ((asciiFrase[i]>=97) && (asciiFrase[i]<=122)) {
                    asciiFrase[i] -= (byte) cifra;
                    //Ir para o final do alfabeto se passar de a
                    if(asciiFrase[i]<97){
                        asciiFrase[i] += 26;
                    }
                }
        }
        //Transformar a frase decriptografada de ascii para string e retornar
        return new String(asciiFrase);
    }
}

package br.inatel.exception;

//Exceção Unchecked para validação do número de amigos de uma rede social
public class NumAmigosInvalidoException extends RuntimeException{
    public NumAmigosInvalidoException(String message){
        super(message);
    }
}

package br.inatel.exception;

//Exceção Checked para validação de email do usuário
public class EmailInvalidoException extends Exception{
    public EmailInvalidoException(String message) {
        super(message);
    }
}

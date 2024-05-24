package br.inatel.redesocial;

import br.inatel.exception.EmailInvalidoException;

import java.util.HashMap;
import java.util.Map;

public class Usuario {
    //Atributos do usuário
    private String nome;
    private String email;
    private Map<String,RedeSocial> redesSociais;

    //Construtores do Usuario
    public Usuario(Map<String, RedeSocial> redesSociais) {
        this.redesSociais = redesSociais;
    }
    public Usuario(String nome, String email, Map<String, RedeSocial> redesSociais) throws EmailInvalidoException {
        this.nome = nome;
        if(email.matches("\\w+\\@\\w+\\.\\w+")){
            this.email = email;
        }
        else{
            throw new EmailInvalidoException("Email inválido!");
        }
        this.redesSociais = redesSociais;
    }

    //Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws EmailInvalidoException {
        if(email.matches("\\w+\\@\\w+\\.\\w+")){
            this.email = email;
        }
        else{
            throw new EmailInvalidoException("Email inválido!");
        }
    }

    public Map<String, RedeSocial> getRedesSociais() {
        return redesSociais;
    }
}

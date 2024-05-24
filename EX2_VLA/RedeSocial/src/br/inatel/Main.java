package br.inatel;

import br.inatel.exception.EmailInvalidoException;
import br.inatel.exception.NumAmigosInvalidoException;
import br.inatel.redesocial.*;

import java.util.HashMap;
import java.util.Map;


public class Main {
    public static void main(String[] args) {
        //Criar um hashSet de redes sociais
        Map<String,RedeSocial> redesSociais = new HashMap<>();


        //Criar um usuário
        Usuario usuario = new Usuario(redesSociais);
        usuario.setNome("Virginia Leticia");
        //Verificação se email é válido
        try {
            usuario.setEmail("vlafonso@hotmail.com");
        } catch (EmailInvalidoException e) {
            System.out.println(e.getMessage());
        }

        //Criação de outro usuário e validação de email
        try {
            Usuario usuario2 = new Usuario("Ana", "email", redesSociais);
        } catch (EmailInvalidoException e) {
            System.out.println(e.getMessage());
        }


        //Mostrar informações do usuário
        System.out.println("\nInformações do usuário:");
        System.out.println("Nome: "+usuario.getNome());
        System.out.println("E-mail: "+usuario.getEmail());


        //Criar redes sociais e adicionar ao usuário
        usuario.getRedesSociais().put("Facebook", new Facebook("senhaFacebook", 107));
        usuario.getRedesSociais().put("Instagram", new Instagram("senhaInstagram", 253));

        //Verificar se número de amigos é válido
        try {
            usuario.getRedesSociais().put("Twitter", new Instagram("senhaTwitter", -5));
        } catch (NumAmigosInvalidoException e){
            System.out.println(e.getMessage());
        }


        //Usar Instagram - postar foto e video e curtir publicação
        System.out.println("\nUsuário "+usuario.getNome()+" usando Instagram:");
        usuario.getRedesSociais().get("Instagram").postarFoto();
        usuario.getRedesSociais().get("Instagram").postarVideo();
        usuario.getRedesSociais().get("Instagram").curtirPublicacao();


        //Usar Facebook - postar comentário, realizar video conferência e compartilhar
        System.out.println("\nUsuário "+usuario.getNome()+" usando Facebook:");
        if(usuario.getRedesSociais().get("Facebook") instanceof Facebook){
            Facebook facebookAux = (Facebook) usuario.getRedesSociais().get("Facebook");
            facebookAux.postarComentario();
            facebookAux.fazStreaming();
            facebookAux.compartilhar();
        }
    }
}

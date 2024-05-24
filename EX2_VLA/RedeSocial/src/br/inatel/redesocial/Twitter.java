package br.inatel.redesocial;

public class Twitter extends RedeSocial implements Compartilhamento{
    //Construtor do Twitter
    public Twitter(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    //Postar foto, vídeo e comentário
    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no Twitter!");
    }
    @Override
    public void postarVideo() {
        System.out.println("Postou um vídeo no Twitter!");
    }
    @Override
    public void postarComentario() {
        System.out.println("Postou um comentário no Twitter!");
    }

    //Curtir publicação
    @Override
    public void curtirPublicacao(){
        System.out.println("Curtiu uma publicação no Twitter!");
    }

    //Compartilhar algo
    @Override
    public void compartilhar() {
        System.out.println("Compartilhou no Twitter!");
    }
}

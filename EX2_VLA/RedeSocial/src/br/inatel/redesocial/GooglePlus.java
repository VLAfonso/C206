package br.inatel.redesocial;

public class GooglePlus extends RedeSocial implements VideoConferencia, Compartilhamento{
    //Construtor do GooglePlus
    public GooglePlus(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    //Postar foto, vídeo e comentário
    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no GooglePlus!");
    }
    @Override
    public void postarVideo() {
        System.out.println("Postou um vídeo no GooglePlus!");
    }
    @Override
    public void postarComentario() {
        System.out.println("Postou um comentário no GooglePlus!");
    }

    //Curtir publicação
    @Override
    public void curtirPublicacao(){
        System.out.println("Curtiu uma publicação no GooglePlus!");
    }

    //Realizar uma vídeo conferência
    @Override
    public void fazStreaming() {
        System.out.println("Realizou uma vídeo conferência no GooglePlus!");
    }

    //Compartilhar algo
    @Override
    public void compartilhar() {
        System.out.println("Compartilhou no GooglePlus!");
    }
}

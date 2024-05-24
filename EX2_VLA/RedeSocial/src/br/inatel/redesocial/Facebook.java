package br.inatel.redesocial;

public class Facebook extends RedeSocial implements VideoConferencia, Compartilhamento{
    //Construtor do Facebook
    public Facebook(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    //Postar foto, vídeo e comentário
    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no Facebook!");
    }
    @Override
    public void postarVideo() {
        System.out.println("Postou um vídeo no Facebook!");
    }
    @Override
    public void postarComentario() {
        System.out.println("Postou um comentário no Facebook!");
    }

    //Curtir publicação
    @Override
    public void curtirPublicacao(){
        System.out.println("Curtiu uma publicação no Facebook!");
    }

    //Realizar uma vídeo conferência
    @Override
    public void fazStreaming() {
        System.out.println("Realizou uma vídeo conferência no Facebook!");
    }

    //Compartilhar algo
    @Override
    public void compartilhar() {
        System.out.println("Compartilhou no Facebook!");
    }
}

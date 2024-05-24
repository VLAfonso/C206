package br.inatel.redesocial;

public class Instagram extends RedeSocial{
    //Construtor do Instagram
    public Instagram(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    //Postar foto, vídeo e comentário
    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no Instagram!");
    }
    @Override
    public void postarVideo() {
        System.out.println("Postou um vídeo no Instagram!");
    }
    @Override
    public void postarComentario() {
        System.out.println("Postou um comentário no Instagram!");
    }

    //Curtir publicação
    @Override
    public void curtirPublicacao(){
        System.out.println("Curtiu uma publicação no Instagram!");
    }
}

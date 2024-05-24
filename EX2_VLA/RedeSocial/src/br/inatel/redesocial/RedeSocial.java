package br.inatel.redesocial;

import br.inatel.exception.NumAmigosInvalidoException;

public abstract class RedeSocial {
    //Atibutos da rede social
    protected String senha;
    protected int numAmigos;

    //Construtor da rede social
    public RedeSocial(String senha, int numAmigos) {
        this.senha = senha;
        if(numAmigos>=0){
            this.numAmigos = numAmigos;
        }
        else{
            throw new NumAmigosInvalidoException("Quantidade de amigos inválida!");
        }
    }

    //Postar foto, video e comentário - métodos abstratos
    public abstract void postarFoto();
    public abstract void postarVideo();
    public abstract void postarComentario();

    //Curtir publicação
    public void curtirPublicacao(){
        System.out.println("Curtiu uma publicação!");
    }
}

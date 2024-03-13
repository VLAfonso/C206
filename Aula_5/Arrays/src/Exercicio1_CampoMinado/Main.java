package Exercicio1_CampoMinado;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Criar campo minado [x][y]
        char[][] campoMinado = new char[2][2]; //B:bomba; X:percorrido; N:não percorrido

        //Adicionar bomba em posição aleatória
        Random rand = new Random();
        int bombaX = rand.nextInt(2);
        int bombaY = rand.nextInt(2);
        campoMinado[bombaX][bombaY] = 'B';

        //Criar entrada de dados
        Scanner entrada = new Scanner(System.in);

        //Criar percurso do campo
        boolean status = true;
        int numPosicoes = 0; //num de posições percorridas pelo usuário
        int usuarioX;
        int usuarioY;
        while(status){
            System.out.println("Qual posição X você deseja acessar?");
            usuarioX = entrada.nextInt();
            System.out.println("Qual posição Y você deseja acessar?");
            usuarioY = entrada.nextInt();
            //Verificar se é uma bomba
            if(campoMinado[usuarioX][usuarioY] == 'B'){
                System.out.println("Booomba!");
                System.out.println("Comece de novo...");
                numPosicoes = 0;
                //Marcar posições que não são bombas como não visitadas
                for(int x=0; x < campoMinado.length; x++)
                    for(int y=0; y < campoMinado[x].length; y++)
                        if(y!=bombaY || x!=bombaX)
                            campoMinado[x][y] = 'N';
            }
            else{
                //Marcar posições que são bombas como visitadas
                if(campoMinado[usuarioX][usuarioY] != 'X')
                {
                    campoMinado[usuarioX][usuarioY] = 'X';
                    numPosicoes += 1;
                }
                if(numPosicoes==3)
                    status = false;
            }
        }

        System.out.println("Você venceu!");

        entrada.close();

    }
}

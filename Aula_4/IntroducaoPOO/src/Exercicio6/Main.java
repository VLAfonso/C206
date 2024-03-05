package Exercicio6;

public class Main {
    public static void main(String[] args) {
        //Criar o primeiro kart e seu piloto
        Kart kartAzul = new Kart();
        Piloto pilotoAzul = new Piloto();

        //Associar piloto ao kart e add suas caracteristicas
        kartAzul.piloto = pilotoAzul;
        kartAzul.nome = "Azulão";
        kartAzul.motor.cilindradas = "150";
        kartAzul.motor.velocidadeMaxima = 150f;
        pilotoAzul.nome = "Vivis";
        pilotoAzul.vilao = false;

        //Criar o segundo kart e seu piloto
        Kart kartAmarelo = new Kart();
        Piloto pilotoAmarelo = new Piloto();

        //Associar piloto ao kart e add suas caracteristicas
        kartAmarelo.piloto = pilotoAmarelo;
        kartAmarelo.nome = "Amurelo";
        kartAmarelo.motor.cilindradas = "100";
        kartAmarelo.motor.velocidadeMaxima = 100.8f;
        pilotoAmarelo.nome = "Nala";
        pilotoAmarelo.vilao = true;

        //Utilizar os métodos dos kats, motores e pilotos
        kartAzul.motor.mostraInfo();
        kartAzul.soltarTurbo();
        kartAzul.pular();
        kartAzul.fazerDrift();
        kartAzul.piloto.soltaSuperPoder();
        kartAmarelo.motor.mostraInfo();
        pilotoAmarelo.soltaSuperPoder();

    }
}

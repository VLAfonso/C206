package Exercicio1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //Caminho do arquivo
        Path arquivo = Paths.get("src/Exercicio1/professores_disciplina.txt");

        try {
            //Ler o arquivo
            List<String> conteudo = Files.readAllLines(arquivo);
            Map<String, String> professoresDisciplina = new HashMap<>();

            //Adicionar o conteúdo no HashMap
            conteudo.forEach((linha) ->{
                String[] linhaQuebrada = linha.split("=");
                professoresDisciplina.put(linhaQuebrada[0], linhaQuebrada[1]);
            });

            //Mostrar conteúdo do HashMap
            professoresDisciplina.forEach((prof, dis)->{
                System.out.println("O professor "+prof+" dá a disciplina "+dis);
            });
        } catch (IOException e){
            e.printStackTrace();
        }


    }
}

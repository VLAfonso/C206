package Exercicio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CifraDeCesar cifraDeCesar = new CifraDeCesar();

        //Criar entrada de dados
        Scanner entrada = new Scanner(System.in);

        //Ler frase do usuário
        System.out.println("Entre com uma frase qualquer:");
        String frase = entrada.nextLine();

        //Criptografar frase
        String fraseCriptografada = cifraDeCesar.criptografar(frase, 3);

        //Caminho do arquivo da frase criptografada
        Path arquivoC = Paths.get("src/Exercicio2/FraseCriptografada.txt");

        //Salvar frase criptografada no arquivo
        try {
            Files.writeString(arquivoC, fraseCriptografada);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        //Caminho do arquivo da frase descriptografada
        Path arquivoD = Paths.get("src/Exercicio2/FraseParaDescriptografar.txt");

        //Abrir frase criptografada no arquivo
        try {
            String fraseDescriptografada = cifraDeCesar.descriptografar(Files.readString(arquivoD), 3);
            System.out.println(fraseDescriptografada);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



        //Fechar entrada de dados
        entrada.close();
    }
}

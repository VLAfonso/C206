package Exercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Gerar número aleatório
        Random rand = new Random();

        //Criar lista de double
        List<Double> listaDouble = new ArrayList<>();

        //Preencher lista com 7 valores gerados aleatoriamente
        for(int i=0; i<7; i++){
            listaDouble.add(rand.nextDouble(30));
        }

        //Mostrar lista sem ordenar
        System.out.println("Lista sem ordenar:");
        for(double num: listaDouble){
            System.out.println(num);
        }

        //Ordenar lista e mostrar
        Collections.sort(listaDouble);
        Collections.reverse(listaDouble);
        System.out.println("\nLista ordenada de forma decrescente:");
        for(double num: listaDouble){
            System.out.println(num);
        }
    }
}

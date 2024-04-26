package Exercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Criar 2 classes filhas de cada
        ClasseFilha1 cF11 = new ClasseFilha1("Aa", 13);
        ClasseFilha1 cF12 = new ClasseFilha1("Bb", 1);
        ClasseFilha2 cF21 = new ClasseFilha2("Cc", 27);
        ClasseFilha2 cF22 = new ClasseFilha2("Dd", 89);
        ClasseFilha3 cF31 = new ClasseFilha3("Ee", 0);
        ClasseFilha3 cF32 = new ClasseFilha3("Ff", 312);

        //Criar uma lista da ClasseMae
        List<ClasseMae> lista = new ArrayList<>();

        //Adicionar filhas às classes
        lista.add(cF11);
        lista.add(cF12);
        lista.add(cF21);
        lista.add(cF22);
        lista.add(cF31);
        lista.add(cF32);

        //Mostrar lista sem ordenar
        System.out.println("Lista sem ordenar:");
        for (ClasseMae l:lista){
            System.out.println(l.getTexto()+" - "+l.getNumero());
        }

        //Ordenar lista e ordenar
        Collections.sort(lista);
        System.out.println("\nLista ordenada de forma decrescente pelo número:");
        for (ClasseMae l:lista){
            System.out.println(l.getTexto()+" - "+l.getNumero());
        }
    }
}

package Exercicio3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Criar um ArrayList
        List<Integer> arrayList = new ArrayList<>();

        //Criar um HashSet
        Set<Integer> hashSet = new HashSet<>();

        //Criar um HashMap
        Map<Integer, Integer> hashMap = new HashMap<>();

        //Parâmetros
        int valorMax = 100000; //Quantidade de valores a serem inseridos
        long ti, tf; //Tempo inicial e final de contagem

        //Adicionar valores
        //ArrayList
        ti = System.currentTimeMillis();
        for(int i=0; i<valorMax; i++){
            arrayList.add(i);
        }
        tf = System.currentTimeMillis();
        System.out.println("Tempo gasto de inserção no ArrayList: "+(tf-ti)+" ms.");

        //HashSet
        ti = System.currentTimeMillis();
        for(int i=0; i<valorMax; i++){
            hashSet.add(i);
        }
        tf = System.currentTimeMillis();
        System.out.println("Tempo gasto de inserção no HashSet: "+(tf-ti)+" ms.");

        //HashMap
        ti = System.currentTimeMillis();
        for(int i=0; i<valorMax; i++){
            hashMap.put(i,i);
        }
        tf = System.currentTimeMillis();
        System.out.println("Tempo gasto de inserção no HashMap: "+(tf-ti)+" ms.");

        //Buscar todos os elementos e calcular e mostrar tempo
        //ArrayList
        ti = System.currentTimeMillis();
        for(int i=0; i<valorMax; i++){
            arrayList.contains(i);
        }
        tf = System.currentTimeMillis();
        System.out.println("Tempo gasto de busca no ArrayList: "+(tf-ti)+" ms.");

        //HashSet
        ti = System.currentTimeMillis();
        for(int i=0; i<valorMax; i++){
            hashSet.contains(i);
        }
        tf = System.currentTimeMillis();
        System.out.println("Tempo gasto de busca no HashSet: "+(tf-ti)+" ms.");

        //HashMap
        ti = System.currentTimeMillis();
        for(int i=0; i<valorMax; i++){
            hashMap.containsKey(i);
        }
        tf = System.currentTimeMillis();
        System.out.println("Tempo gasto de busca no HashMap: "+(tf-ti)+" ms.");

    }
}

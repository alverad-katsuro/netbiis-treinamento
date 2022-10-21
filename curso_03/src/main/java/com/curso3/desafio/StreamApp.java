package com.curso3.desafio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamApp {
    static List<String> pessoas = new ArrayList<String>();

    public static void main(String[] args) {
        pessoas.add("Aurora");
        pessoas.add("Alfredo");
        pessoas.add("Gabriel");
        pessoas.add("Fernando");
        pessoas.add("João");

        /*
         *
         pessoas.stream().map(String::toUpperCase).sorted((a,b) -> b.compareTo(a)).forEach(System.out::println);
         
         boolean anyStartsWithA =
         pessoas.stream().anyMatch((s) -> s.startsWith("A"));
         System.out.println(anyStartsWithA); // true
         boolean allStartsWithA =
         pessoas.stream().allMatch((s) -> s.startsWith("A"));
         System.out.println(allStartsWithA); // false
         boolean noneStartsWithZ =
         pessoas.stream().noneMatch((s) -> s.startsWith("z"));
         System.out.println(noneStartsWithZ); // true
         */
        filtrar2("A");
        ordenar2("A");
        contar2("A");

    }
    
    public static void filtrar(String letra){
        pessoas.stream().filter(s -> s.startsWith(letra)).forEach(System.out::println);
    }

    public static void filtrar2(String letra){
        for (String string : pessoas) {
            if (string.charAt(0) == letra.charAt(0)) {
                System.out.println(string);
            }
        }
    }

    public static void ordenar(String letra){
        pessoas.stream().sorted().filter(s -> s.startsWith(letra)).forEach(System.out::println);
        
    }

    public static void ordenar2(String letra){
        List<String> nova_lista = new ArrayList<String>();
        for (String string : pessoas) {
            if (string.charAt(0) == letra.charAt(0)) {
                nova_lista.add(string);
            }
        }
        Collections.sort(nova_lista);
        for (String string2 : nova_lista) {
            System.out.println(string2);
        }
    }

    public static void contar(String letra) {
        System.out.println(pessoas.stream().filter(s -> s.startsWith(letra)).count());
        
    }

    public static void contar2(String letra) {
        int contador = 0;
        for (String string : pessoas) {
            if (string.charAt(0) == letra.charAt(0)) {
                contador++;
            }
        }
        System.out.println(contador);
    }
}

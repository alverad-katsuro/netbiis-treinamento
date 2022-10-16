package com.curso3.unidade4;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeApp {
    public static void main(String args[]) {
        Deque<String> lista = new ArrayDeque<>();
        lista.add("powerrangerrrrr vermelho");
        lista.add("grreeeeeen");
        lista.add("grreeeeeen");
        lista.add("amareloooooooooooooooo");
        System.out.println(lista);
        lista.removeFirst();
        lista.removeLast();
        System.out.println(lista);
        lista.addFirst("sou o primeiro agr");
        lista.addLast("sou o ultimo agr");
        System.out.println(lista.peekFirst());
        System.out.println(lista.peekLast());
        System.out.println(lista);
    }
}

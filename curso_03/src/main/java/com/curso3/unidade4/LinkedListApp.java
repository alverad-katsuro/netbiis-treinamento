package com.curso3.unidade4;

import java.util.LinkedList;

public class LinkedListApp {
    public static void main(String args[]) {
        LinkedList<String> lista = new LinkedList<>();
        lista.add("red");
        lista.add("green");
        lista.add("green");
        lista.add("yellow");
        System.out.println(lista);
        lista.removeFirst();
        lista.removeLast();
        System.out.println(lista);
    }
}

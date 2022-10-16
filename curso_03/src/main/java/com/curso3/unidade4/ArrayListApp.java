package com.curso3.unidade4;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListApp {
    public static void main(String args[]) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("red");
        lista.add("greem");
        lista.add("greem");
        lista.add("yellow");
        System.out.println(lista);
        Collections.sort(lista);
        System.out.println(lista);
    }
}

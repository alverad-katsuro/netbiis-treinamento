package com.curso3.unidade4;

import java.util.ArrayList;
import java.util.List;

public class MyBook {
    public static void main(String[] args) {
        List<String> array = new ArrayList<>();
        array.add("Buy bread");
        array.add("Sell car");
        array.add("11:30 mtg");

        //System.out.println(array);
        long temp_ini = System.currentTimeMillis();
        cria_mil();

        System.out.println("O tempo foi " + (System.currentTimeMillis() - temp_ini) + " milisegundos");

    }

    public static void cria_mil(){
        List<String> array = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            array.add("Elemento " + i);
        }

        System.out.println(array);
    }
}

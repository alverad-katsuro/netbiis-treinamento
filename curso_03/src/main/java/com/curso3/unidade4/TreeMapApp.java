package com.curso3.unidade4;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapApp {
    public static void main(String[] args) {
        Map<Integer, String> mapa = new TreeMap<>()
        ;
        mapa.put(4, "key valor 4");
        mapa.put(2, "key valor 2");
        mapa.put(3, "key valor 3 old"); 
        mapa.put(3, "key valor 3 new"); // sobreescreve
        mapa.put(1, "key valor 1");
        System.out.println(mapa);
    }
}

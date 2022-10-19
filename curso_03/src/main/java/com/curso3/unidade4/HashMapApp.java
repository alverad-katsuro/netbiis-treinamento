package com.curso3.unidade4;

import java.util.HashMap;
import java.util.Map;

public class HashMapApp {
    public static void main(String[] args) {
        Map<Integer, String> mapa = new HashMap<>();
        mapa.put(4, "key valor 4");
        mapa.put(2, "key valor 2");
        mapa.put(3, "key valor 3 old");
        mapa.put(3, "key valor 3 new");
        mapa.put(1, "key valor 1");
        System.out.println(mapa);
        }
}

package com.curso3.unidade5;

import java.util.ArrayList;
import java.util.List;

public class ParallelStreamApp {
    public static void main(String[] args) {
        //colecaoStream(); // 4670 milisegundos
        colecaoParallelStream(); // 5426
    }

    private static void colecaoParallelStream() {
        List<String> lines = new ArrayList<String>();
        int max=1_000_000;
        for (int i = 0; i < max; i++) {
            lines.add("=>"+i);
        }
        long temp_ini = System.currentTimeMillis();
        lines.parallelStream().sorted().forEach(System.out::println);

        System.out.println((System.currentTimeMillis() - temp_ini));
    }

    private static void colecaoStream() {
        List<String> lines = new ArrayList<String>();
        int max=1_000_000;
        for (int i = 0; i < max; i++) {
            lines.add("=>"+i);
        }
        long temp_ini = System.currentTimeMillis();
        lines.stream().sorted().forEach(System.out::println);

        System.out.println((System.currentTimeMillis() - temp_ini));
    }
}

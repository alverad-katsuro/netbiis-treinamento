package com.curso3.unidade5;

import java.util.Arrays;
import java.util.List;

public class Teste {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,2,3,4);

        for(Integer x: integers)
        System.out.println(x);

        integers.forEach(x->System.out.println(x));

        integers.forEach(System.out::println);
    }
}

package com.curso3.unidade5;

import java.util.Arrays;
import java.util.List;

public class LambdaApp3 {
    public static void main(String[] args) {
        int numero = 100;
        List<Integer>integers = Arrays.asList(1, 2, 3, 4, 5);
        integers.forEach(x ->{
            x = x + numero;
            System.out.println(x);
        });
    }
}

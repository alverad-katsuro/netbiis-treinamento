package com.curso3.unidade5;

import java.util.Arrays;
import java.util.List;

public class LambdaApp2 {
    public static void main(String[] args) {
        List<Integer>integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        integers.forEach(x -> {
            x = x * x;
            System.out.println(x);
        });
    }
}

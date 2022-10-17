package com.curso3.unidade5;

import java.util.Arrays;
import java.util.List;

public class LambdaApp {
    private static int var = 1;
    public static void main(String[] args) {
        List<Integer>integers = Arrays.asList(1, 2, 3, 4, 5);
        integers.forEach(x->{
            LambdaApp.var++;
            System.out.println(x + x);
        });
        System.out.println(LambdaApp.var);
    }
}

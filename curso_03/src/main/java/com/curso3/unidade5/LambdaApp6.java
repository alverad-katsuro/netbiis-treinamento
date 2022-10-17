package com.curso3.unidade5;

import java.util.Arrays;
import java.util.List;

public class LambdaApp6 {
    public static void main(String[] args) {
        List<Integer>integers = Arrays.asList(5,4,3,2,1,0);
        integers.forEach((Integer x) ->{
            x = x + 10;
            System.out.println(x);
        });
    }
}

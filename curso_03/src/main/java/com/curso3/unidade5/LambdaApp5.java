package com.curso3.unidade5;

import java.util.Arrays;
import java.util.List;

public class LambdaApp5 {
    public static void main(String[] args) {
        List<Integer>integers = Arrays.asList(2, 3, 4, 5,6,7,8,9,10);
        integers.forEach(x ->{
            int y = x / (x - 1);
            System.out.println(y);
        });
    }
}

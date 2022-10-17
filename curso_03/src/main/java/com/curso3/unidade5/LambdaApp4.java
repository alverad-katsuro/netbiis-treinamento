package com.curso3.unidade5;

import java.util.Arrays;
import java.util.List;

public class LambdaApp4 {
    public static int numero = 11;
    public int somatorio;

    public static void main(String[] args) {
        List<Integer>integers = Arrays.asList(1, 2, 3, 4, 5);
        LambdaApp4 app = new LambdaApp4();
        integers.forEach(x ->{
            x = x + LambdaApp4.numero;
            app.somatorio = app.somatorio + x;
            System.out.println(x);
        });
        System.out.println(app.somatorio);
    }
}

package com.curso3.unidade5;

@FunctionalInterface
public interface Formula {
    double calcular(int a);
    default double sqrt(int a) {
        return Math.sqrt(a);
    }
    default double sqrtX(int a, int b) {
        return Math.pow(a, 1/b);
    }
}

package com.curso3.unidade5;

public class Calculadora {
    public static void main(String[] args) {
        IMatematica anonimo = new IMatematica() {
            public float somar(float a, float b) {return a+b;}
            public float subtrair(float a, float b) {return a-b;}
            public float multiplicar(float a, float b) {return a*b;}
            public float dividir(float a, float b) {return a/b;}
            public double exponenciacao(double a, double b) {return Math.pow(a, b);}
            public double radiciacao(double a, double b) {return Math.pow(a, (1/b));}
        };
        System.out.println("anônimo: " + anonimo.getClass());
        System.out.println("=> " + anonimo.somar(5,5));
        System.out.println("=> " + anonimo.subtrair(6,4));
        System.out.println("=> " + anonimo.multiplicar(3,4));
        System.out.println("=> " + anonimo.dividir(10,2));
        System.out.println("=> " + anonimo.exponenciacao(10,2));
        System.out.println("=> " + anonimo.radiciacao(10,2));
    } 
}

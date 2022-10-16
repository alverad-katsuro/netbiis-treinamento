package com.curso3.unidade3;

public class UsoGenerico {
    public static void main(String[] args){
        ExemploGenerics<Integer> iob = new ExemploGenerics<Integer>(10000);
        iob.showType();
        int v = iob.getOb();
        System.out.println(String.format("Valor de v: %d", v));
        ExemploGenerics<String> sob = new ExemploGenerics<String>("Gen String.");
        sob.showType();
        String s = sob.getOb();
        System.out.println(String.format("Valor de v: %s", s));
    }
}

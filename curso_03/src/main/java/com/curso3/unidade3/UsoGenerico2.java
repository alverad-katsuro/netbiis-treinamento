package com.curso3.unidade3;

public class UsoGenerico2 {
    public static void main(String[] args) {
        ExemploGenerics2<Integer, String> iob = new ExemploGenerics2<Integer,String>(88,"ABC");
        iob.showType();

        int v = iob.getOb1();
        String s = iob.getOb2();

        System.out.println(String.format("Valor de v: %d",v));
        System.out.println(String.format("Valor de s: %s",s));
    }
}

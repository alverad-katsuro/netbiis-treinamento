package com.curso3.unidade3;

public class ExemploGenerics2 <T, V> {
    private T ob;
    private V ob2;

    public ExemploGenerics2(T ob, V ob2){
        this.ob = ob;
        this.ob2 = ob2;
    }

    public T getOb1(){
        return this.ob;
    }

    public V getOb2(){
        return this.ob2;
    }

    public void showType(){
        System.out.println("Tipo T e->" + ob.getClass().getName());
    }

    public void showType2(){
        System.out.println("Tipo V e->" + ob2.getClass().getName());
    }
}

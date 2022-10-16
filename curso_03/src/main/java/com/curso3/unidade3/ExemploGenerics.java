package com.curso3.unidade3;

public class ExemploGenerics <T> {
    private T ob;
    public ExemploGenerics(T ob){
        this.ob = ob;
    }

    public T getOb(){
        return this.ob;
    }

    public void showType(){
        System.out.println("Tipo T e->" + ob.getClass().getName());
    }
}

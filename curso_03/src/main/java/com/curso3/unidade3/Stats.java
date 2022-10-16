package com.curso3.unidade3;

public class Stats<T extends Number> {
    private T[] num;
    public Stats(T[] num){
        this.num = num;
    }

    public double media(){
        double soma = 0;
        int i;
        for(i = 0; i < num.length; i++){
            soma = soma + num[i].doubleValue();
        }
        return (soma/i);
    }
}

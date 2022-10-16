package com.curso3.unidade3;

public class NotaAluno {
    double valor;
    
    public <T extends Number> NotaAluno(T obj) {
        this.valor = obj.doubleValue();
    }

    public <T extends Number> double retonarValor(T obj){
        return this.valor;
    }
}

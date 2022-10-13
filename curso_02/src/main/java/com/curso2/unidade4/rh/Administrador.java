package com.curso2.unidade4.rh;

public class Administrador extends Funcionario {
    
    @Override
    public double getBonificacao() {
        return getSalario() * 2;
    }
}

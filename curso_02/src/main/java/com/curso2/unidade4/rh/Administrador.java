package com.curso2.unidade4.rh;

public class Administrador extends Funcionario {
    
    
    /** 
     * @return double
     */
    @Override
    public double getBonificacao() {
        return getSalario() * 2;
    }
}

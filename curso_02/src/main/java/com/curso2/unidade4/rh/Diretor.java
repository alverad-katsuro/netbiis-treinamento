package com.curso2.unidade4.rh;

public class Diretor extends Funcionario {

    
    /** 
     * @return double
     */
    @Override
    public double getBonificacao() {
        return getSalario() * 3;
    }
    
}

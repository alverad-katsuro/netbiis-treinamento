package com.curso2.unidade4;

import java.util.ArrayList;

public class ContaPoupanca extends Conta{
    
    public ContaPoupanca(ArrayList<Cliente2> cliente, Double saldo, Double limite_total, int numero){
        super(cliente, saldo, limite_total, numero);
    }

    
    /** 
     * @param taxa
     */
    public void atualiza(double taxa){
        setSaldo(getSaldo() * (1 + taxa * 3));
    }
}

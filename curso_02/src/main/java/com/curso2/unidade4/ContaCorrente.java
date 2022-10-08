package com.curso2.unidade4;

import java.util.ArrayList;

public class ContaCorrente extends Conta {

    public ContaCorrente(ArrayList<Cliente2> cliente, Double saldo, Double limite_total, int numero){
        super(cliente, saldo, limite_total, numero);
    }

    public void atualiza(double taxa){
        setSaldo(getSaldo() * (1 + taxa * 2));
    }
}

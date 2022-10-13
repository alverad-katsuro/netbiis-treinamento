package com.curso2.unidade4.rh;

public class Professor extends Funcionario implements Autenticavel, Cidadao, Contribuinte {
    
    @Override
    public double getBonificacao() {
        return getSalario() * 1.4;
    }

    @Override
    public boolean autentica(String senha) {
        return false;
    }

    @Override
    public String getRG() {
        return super.getRG();
    }

    @Override
    public void vota() {
        System.out.println("Votei");
    }

    @Override
    public String getCFP() {
        return super.getCPF();
    }

    @Override
    public void pagaIR() {
        System.out.println("Paguei");
    }
}

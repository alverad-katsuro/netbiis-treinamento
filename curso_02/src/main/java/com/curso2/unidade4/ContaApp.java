package com.curso2.unidade4;

import java.util.ArrayList;

public class ContaApp {
    public static void main(String[] args) {
        ArrayList<Cliente2> cliente1 =  new ArrayList<Cliente2>();
        cliente1.add(new Cliente2("Nome", "CPF", "Rua"));
        cliente1.add(new Cliente2("Nome", "CPF", "Rua"));
        cliente1.add(new Cliente2("Nome", "CPF", "Rua"));
        cliente1.add(new Cliente2("Nome", "CPF", "Rua"));
        cliente1.add(new Cliente2("Nome", "CPF", "Rua"));
        cliente1.add(new Cliente2("Nome", "CPF", "Rua"));
        cliente1.add(new Cliente2("Nome", "CPF", "Rua"));
        ArrayList<Cliente2> cliente2 =  new ArrayList<Cliente2>();
        cliente2.add(new Cliente2("Nome2", "CPF", "Rua"));       
        Conta c1 = new Conta(cliente1, 1500.0, 500.0, 0);
        Conta c2 = new Conta(cliente2, 10000.0, 1000.0, 1);
        System.out.println(c1.getSaldoTotal());
        c1.saque(2000.0);
        System.out.println(c1.getSaldoTotal());
        c1.deposito(10.0);
        c2.transfere(c1, 5000.0);
        System.out.println(c1.getSaldoTotal());
    }
}

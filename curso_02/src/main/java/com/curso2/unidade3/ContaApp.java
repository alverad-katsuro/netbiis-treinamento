package com.curso2.unidade3;

public class ContaApp {
    public static void main(String[] args) {
        Conta c1 = new Conta("U1", 1500.0, 500.0, 0);
        Conta c2 = new Conta("U2", 10000.0, 1000.0, 1);
        System.out.println(c1.getSaldoTotal());
        c1.saque(2000.0);
        System.out.println(c1.getSaldoTotal());
        c1.deposito(10.0);
        c2.transfere(c1, 5000.0);
        System.out.println(c1.getSaldoTotal());
    }
}

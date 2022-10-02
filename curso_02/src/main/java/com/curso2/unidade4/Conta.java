package com.curso2.unidade4;

/* Não foi necessário utilizar todas os get e set */

public class Conta {
    private String nome;
    private Double saldo;
    private Double limite;
    private Double limite_total;
    private int numero;

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

    public Conta(String nome, Double saldo, Double limite_total, int numero) {
        this.nome = nome;
        this.saldo = saldo;
        this.limite = limite_total;
        this.limite_total = limite_total;
        this.numero = numero;
    }

    public boolean saque(Double valor){
        if (valor > getSaldo() + getLimite()) {
            return false;
        } else {
            if (valor <= getSaldo()) {
                setSaldo(getSaldo() - valor);
            } else {
                Double resto = valor - getSaldo();
                setSaldo(0.0);
                setLimite(getLimite() - resto);               
            }
            return true;
        }
    }

    public void deposito(Double valor){
        if (getLimite_total() != getLimite()){
            if (valor > getLimite_total() - getLimite()){
                valor = valor - (getLimite_total() - getLimite());
                setLimite(getLimite_total());
                setSaldo(getSaldo() + valor);
            } else {
                setLimite(getLimite() + valor);
            }
        } else {
            setSaldo(getSaldo() + valor);
        }
    }

    public void transfere(Conta conta, Double valor){
        if (saque(valor)) {
            conta.deposito(valor);
        }
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Double getSaldo() {
        return saldo;
    }
    public Double getSaldoTotal() {
        return (saldo + (limite - limite_total));
    }
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    public Double getLimite() {
        return limite;
    }
    
    public Double getLimite_total() {
        return limite_total;
    }

    public void setLimite_total(Double limite_total) {
        this.limite_total = limite_total;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    
}

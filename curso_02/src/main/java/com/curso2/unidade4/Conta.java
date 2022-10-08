package com.curso2.unidade4;

import java.util.ArrayList;

/* Não foi necessário utilizar todas os get e set */

public class Conta {
    /* Anterior
        private Cliente2 cliente;
     */
    protected ArrayList<Cliente2> cliente = new ArrayList<Cliente2>();
    protected Double saldo;
    protected Double limite;
    protected Double limite_total;
    protected int numero;

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

    public Conta(ArrayList<Cliente2> cliente, Double saldo, Double limite_total, int numero) {
        if (cliente.size() < 6) {
            this.cliente = cliente;
        } else {
            System.out.println("AAAAAAAAA" + cliente.size());
            new Exception();
        }
        this.saldo = saldo;
        this.limite = limite_total;
        this.limite_total = limite_total;
        this.numero = numero;
    }

    public void atualiza(double taxa){
        setSaldo(getSaldo() * (1 + taxa));
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

    public ArrayList<Cliente2> getCliente() {
        return cliente;
    }
    public void setCliente(ArrayList<Cliente2> cliente) {
        if (cliente.size() < 6) {
            this.cliente = cliente;
        } else {
            new Exception("Muitos clientes na conta");
        }
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

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

    
    /** 
     * @param taxa
     */
    public void atualiza(double taxa){
        setSaldo(getSaldo() * (1 + taxa));
    }

    
    /** 
     * @param valor
     * @return boolean
     */
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

    
    /** 
     * @param valor
     */
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

    
    /** 
     * @param conta
     * @param valor
     */
    public void transfere(Conta conta, Double valor){
        if (saque(valor)) {
            conta.deposito(valor);
        }
    }

    
    /** 
     * @return ArrayList<Cliente2>
     */
    public ArrayList<Cliente2> getCliente() {
        return cliente;
    }
    
    /** 
     * @param cliente
     */
    public void setCliente(ArrayList<Cliente2> cliente) {
        if (cliente.size() < 6) {
            this.cliente = cliente;
        } else {
            new Exception("Muitos clientes na conta");
        }
    }
    
    /** 
     * @return Double
     */
    public Double getSaldo() {
        return saldo;
    }
    
    /** 
     * @return Double
     */
    public Double getSaldoTotal() {
        return (saldo + (limite - limite_total));
    }
    
    /** 
     * @param saldo
     */
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    
    /** 
     * @return Double
     */
    public Double getLimite() {
        return limite;
    }
    
    
    /** 
     * @return Double
     */
    public Double getLimite_total() {
        return limite_total;
    }

    
    /** 
     * @param limite_total
     */
    public void setLimite_total(Double limite_total) {
        this.limite_total = limite_total;
    }

    
    /** 
     * @param limite
     */
    public void setLimite(Double limite) {
        this.limite = limite;
    }
    
    /** 
     * @return int
     */
    public int getNumero() {
        return numero;
    }
    
    /** 
     * @param numero
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    
}

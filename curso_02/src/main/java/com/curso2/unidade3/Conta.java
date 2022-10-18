package com.curso2.unidade3;

/* Não foi necessário utilizar todas os get e set */

public class Conta {
    private String nome;
    private Double saldo;
    private Double limite;
    private Double limite_total;
    private int numero;


    public Conta(String nome, Double saldo, Double limite_total, int numero) {
        this.nome = nome;
        this.saldo = saldo;
        this.limite = limite_total;
        this.limite_total = limite_total;
        this.numero = numero;
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
     * @return String
     */
    public String getNome() {
        return nome;
    }
    
    /** 
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
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

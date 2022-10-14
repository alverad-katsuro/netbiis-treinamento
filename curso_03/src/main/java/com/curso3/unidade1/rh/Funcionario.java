package com.curso3.unidade1.rh;

import javax.swing.JOptionPane;

public abstract class Funcionario {
    protected float salario;
    protected String rg;
    protected String cpf;
    protected Colacao colacao;
    protected String nome;


    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        Funcionario diretor = new Diretor();
        Funcionario professor = new Professor();
        Funcionario adm = new Administrador();
        verificarTipoFuncionario(adm);
        verificarTipoFuncionario(diretor);
        verificarTipoFuncionario(professor);
    }

    
    /** 
     * @param obj
     */
    public static void verificarTipoFuncionario(Funcionario obj){
        if (obj instanceof Diretor) {
            JOptionPane.showMessageDialog(null, "É diretor");
        } else if (obj instanceof Professor ){
            JOptionPane.showMessageDialog(null, "É professor");
        } else {
            JOptionPane.showMessageDialog(null, "É administrador");
        }

    }

    
    /** 
     * @return float
     */
    public float getSalario() {
        return salario;
    }

    
    /** 
     * @param salario
     */
    public void setSalario(float salario) {
        this.salario = salario;
    }

    
    /** 
     * @return String
     */
    public String getRG() {
        return rg;
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
     * @param rg
     */
    public void setRG(String rg) {
        this.rg = rg;
    }

    
    /** 
     * @return String
     */
    public String getCPF() {
        return cpf;
    }

    
    /** 
     * @param cpf
     */
    public void setCPF(String cpf) {
        this.cpf = cpf;
    }

    
    /** 
     * @return Colacao
     */
    public Colacao getColacao() {
        return colacao;
    }

    
    /** 
     * @param colacao
     */
    public void setColacao(Colacao colacao) {
        this.colacao = colacao;
    }

    
}

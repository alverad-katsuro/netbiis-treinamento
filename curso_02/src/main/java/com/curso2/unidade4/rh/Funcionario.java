package com.curso2.unidade4.rh;

import javax.swing.JOptionPane;

public abstract class Funcionario {
    protected float salario;
    protected String rg;
    protected String cpf;


    
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

    public abstract double getBonificacao();

    
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

    
}

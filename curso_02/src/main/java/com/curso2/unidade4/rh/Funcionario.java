package com.curso2.unidade4.rh;

import javax.swing.JOptionPane;

public abstract class Funcionario {
    protected float salario;
    protected String rg;
    protected String cpf;


    public static void main(String[] args) {
        Funcionario diretor = new Diretor();
        Funcionario professor = new Professor();
        Funcionario adm = new Administrador();
        verificarTipoFuncionario(adm);
        verificarTipoFuncionario(diretor);
        verificarTipoFuncionario(professor);
    }

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

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getRG() {
        return rg;
    }

    public void setRG(String rg) {
        this.rg = rg;
    }

    public String getCPF() {
        return cpf;
    }

    public void setCPF(String cpf) {
        this.cpf = cpf;
    }

    
}

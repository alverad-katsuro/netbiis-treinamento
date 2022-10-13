package com.curso3.unidade1.rh;

import javax.swing.JOptionPane;

public abstract class Funcionario {
    protected float salario;
    protected String rg;
    protected String cpf;
    protected Colacao colacao;
    protected String nome;


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

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getRG() {
        return rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public Colacao getColacao() {
        return colacao;
    }

    public void setColacao(Colacao colacao) {
        this.colacao = colacao;
    }

    
}

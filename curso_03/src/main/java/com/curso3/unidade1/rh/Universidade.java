package com.curso3.unidade1.rh;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Universidade {
    private ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        
    }

    
    /** 
     * @return ArrayList<Funcionario>
     */
    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    
    /** 
     * @param funcionarios
     */
    public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    
    /** 
     * @param funcionario
     */
    public void addFuncionario(Funcionario funcionario){
        this.funcionarios.add(funcionario);
    }

    
    /** 
     * @param funcionarios
     */
    public static void gerarRelatorioProfessoresMestresDoutores(ArrayList<Funcionario> funcionarios){
        int graduacao = 0;
        int mestres = 0;
        int doutores = 0;
        for (Funcionario funcionario : funcionarios) {
            switch (funcionario.getColacao()) {
                case MESTRADO -> mestres++;
                case DOUTORADO -> doutores++;
                case GRADUACAO -> graduacao++;
            }
        }
        JOptionPane.showMessageDialog(null, String.format("Há %d funcionarios, sendo:\n%d Doutores\n%d Mestres\n%d Graduandos", (mestres + graduacao + doutores), doutores, mestres, graduacao));
    }
    
}

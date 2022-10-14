package com.curso1.unidade_four;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.curso1.unidade_two.Aluno;

public class CadastraAluno {

    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        String matricula = JOptionPane.showInputDialog(null, "Informe a matricula\n0 - Para Finalizar");
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		while(!matricula.equals("0")) {
            Aluno aluno = new Aluno();
            aluno.setMatricula(matricula);
			aluno.setNome();
            aluno.setSexo();
            aluno.setEndereco();
            aluno.setTelefone();
            alunos.add(aluno);
			matricula = JOptionPane.showInputDialog(null, "Informe a matricula\n0 - Para Finalizar");			
		}
	}

}

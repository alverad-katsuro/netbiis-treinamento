package com.curso1.unidade_five;

import javax.swing.JOptionPane;

public class Aluno {

	
    /** 
     * @param args
     */
    public static void main(String[] args) {
		
		String nome;
        String saida = "";
		String lista_alunos[] = new String[5];
		//leitura dos nomes a serem inseridos no vetor
		for(int i = 0; i < lista_alunos.length; i++) {
			nome = JOptionPane.showInputDialog("Digite o nome do Aluno " + (i + 1));
			lista_alunos[i] = nome;			
		}
		for(int i=0; i < 5; i++) {
            saida += (i + 1) + "º Nome = "+lista_alunos[i] + "\n";
		}
        JOptionPane.showMessageDialog(null, saida);
	}
}

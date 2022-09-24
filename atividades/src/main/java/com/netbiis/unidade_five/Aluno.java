package com.netbiis.unidade_five;

import javax.swing.JOptionPane;

public class Aluno {

	public static void main(String[] args) {
		
		int i;
		String nome;
		String lista_alunos[] = new String[5];
		//leitura dos nomes a serem inseridos no vetor
		for(i=0;i<5;i++)
		{
			nome = JOptionPane.showInputDialog("Digite o nome do Aluno");
			lista_alunos[i] = nome;			
		}
		for(i=0;i<5;i++)
		{
			System.out.println("Nome="+lista_alunos[i]);			
		}
	}
}

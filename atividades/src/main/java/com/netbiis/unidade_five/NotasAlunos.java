package com.netbiis.unidade_five;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class NotasAlunos {

	public static void main(String[] args) {
		
		int i,j,aprovados=0,reprovados=0;
		double soma=0,media=0;
		String nome;
		String lista_alunos[] = new String[5];
		boolean situacao_alunos[] = new boolean[5];
		double notas_alunos[][] = new double[5][4];
		
		Scanner teclado = new Scanner(System.in);		
		//leitura dos nomes a serem inseridos no vetor
		for(i=0;i<5;i++)
		{
			nome = JOptionPane.showInputDialog("Digite o nome do Aluno");
			lista_alunos[i] = nome;
			
			for(j=0;j<4;j++)
			{
				System.out.println("Favor informar a nota do aluno");
				notas_alunos[i][j] = teclado.nextDouble();
				soma = soma + notas_alunos[i][j];
			}
			media = soma/4;
			if(media < 5)
				situacao_alunos[i] = false;
			else
				situacao_alunos[i] = true;
			soma = 0;
		}
		for(i=0;i<5;i++)
		{
			if(situacao_alunos[i])
				aprovados++;
			else
				reprovados++;
		}
		System.out.println("Aprovados="+aprovados);
		System.out.println("Reprovados="+reprovados);
		
		teclado.close();
	}
}

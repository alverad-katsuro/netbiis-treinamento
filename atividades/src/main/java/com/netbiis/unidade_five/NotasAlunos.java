package com.netbiis.unidade_five;

import javax.swing.JOptionPane;

public class NotasAlunos {

	public static void main(String[] args) {
		
		int i,j,aprovados=0,reprovados=0;
		double soma=0,media=0;
		String nome;
		String lista_alunos[] = new String[5];
		AlunoSituacao situacao_alunos[] = new AlunoSituacao[5];
		double notas_alunos[][] = new double[5][4];
		
		//leitura dos nomes a serem inseridos no vetor
		for(i = 0; i < 5; i++)
		{
			nome = JOptionPane.showInputDialog("Digite o nome do Aluno");
			lista_alunos[i] = nome;
			
            JOptionPane.showMessageDialog(null, "Informe as notas do aluno");
			for(j = 0; j < 4; j++) {
				notas_alunos[i][j] = Double.parseDouble(JOptionPane.showInputDialog(null, (j + 1) + "º Avaliação: "));
				soma = soma + notas_alunos[i][j];
			}
			if((media / 4) < 5){
				situacao_alunos[i] = AlunoSituacao.REPROVOU;
            }else{
				situacao_alunos[i] = AlunoSituacao.PASSOU;
            }
			soma = 0;
		}
		for(i = 0; i < 5; i++) {
            switch (situacao_alunos[i]) {
                case PASSOU -> aprovados++;
                default -> reprovados++;
            }
		}
        JOptionPane.showMessageDialog(null, "Aprovados = " + aprovados + "Reprovados = " + reprovados);
	}
}

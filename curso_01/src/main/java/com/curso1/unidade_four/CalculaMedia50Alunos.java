package com.curso1.unidade_four;

import javax.swing.JOptionPane;

public class CalculaMedia50Alunos {

	public static void main(String[] args) {
		
		final double NUMERO_AVALIACOES = 4;
		double nota, media;
		double mediaAlunos = 0;
        int qtd_alunos = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de alunos"));
		for (int j = 1; j <= qtd_alunos; j++) {
            nota = 0;
            for(int i = 1; i <= NUMERO_AVALIACOES; i++) {

                nota += Double.parseDouble(JOptionPane.showInputDialog(null, "Infome a nota do " + i + "º avaliação do " + j + "º aluno"));
                
            }
            media = nota / NUMERO_AVALIACOES;
            mediaAlunos = mediaAlunos + media;
        }
        JOptionPane.showMessageDialog(null, "A média de " + qtd_alunos + " alunos é " + mediaAlunos);
	}
}

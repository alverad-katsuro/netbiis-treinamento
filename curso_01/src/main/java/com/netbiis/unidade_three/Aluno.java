package com.netbiis.unidade_three;

import javax.swing.JOptionPane;

public class Aluno {

	public static void main(String[] args) {
		final byte NUMERO_AVALIACOES = 4;
		float nota = 0;
		float media; 
		int frequencia;
		
		for (int i = 1; i <= NUMERO_AVALIACOES; i++) {
            nota += Float.parseFloat((JOptionPane.showInputDialog(null,"Digite a nota da "+ i +"º avaliação")));
        }
		
		frequencia = Integer.parseInt((JOptionPane.showInputDialog(null,"Digite a frequencia do aluno")));
				
		media = nota / NUMERO_AVALIACOES;
		
        JOptionPane.showMessageDialog(null, "A média do aluno foi " + media);
        
		if ((media < 5) || (frequencia < 75)){ 
            JOptionPane.showMessageDialog(null, "Aluno Reprovado");
        } else {
            JOptionPane.showMessageDialog(null, "Aluno Aprovado");
		}
	}

}

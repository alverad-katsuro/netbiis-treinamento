package com.netbiis.unidade_four;

import javax.swing.JOptionPane;

public class PopulacaoAB {

	public static void main(String[] args) {
		
        final double taxaA = 0.03;
		final double taxaB = 0.02;
        double habitantesB = 7000000;
		double habitantesA = 5000000;
		
		int tempo;
		double populacaoA = habitantesA;
		double populacaoB = habitantesB;
		
        for (tempo = 0; populacaoA < populacaoB; tempo++) {
            populacaoB = populacaoB + populacaoB*taxaB;
			populacaoA = populacaoA + populacaoA*taxaA;
        }
        JOptionPane.showMessageDialog(null, "A população A vai levar " + tempo + " para superar a população B");

	}

}

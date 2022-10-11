package com.curso1.unidade_four;


import javax.swing.JOptionPane;

public class NumeroEstrelas {

	public static void main(String[] args) {
		
		int numero_linhas;
		String estrela = "";
		String fim = "";
		numero_linhas = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um numero linhas"));
		for(int i=1 ; i <= numero_linhas; i++) {
            fim += estrela + "\n";
			estrela = estrela + "*";
		}
        fim += estrela + "\n";
        JOptionPane.showMessageDialog(null, fim);
	}
}

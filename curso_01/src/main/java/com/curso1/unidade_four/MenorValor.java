package com.curso1.unidade_four;

import javax.swing.JOptionPane;

public class MenorValor {

	public static void main(String[] args) {
		
		int valor, menor, maior; 

		valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor ou 0 para encerrar"));
		menor = valor;
		maior = valor;
		while(valor != 0) {
			if (valor < menor){
				menor = valor;
            } else if (valor > maior){
				maior = valor;
            }
            valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor ou 0 para encerrar"));
			
		}
		
        JOptionPane.showMessageDialog(null, "O menor valor é "+ menor + " e o maior é " + maior);
	}

}

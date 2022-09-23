package com.netbiis.unidade_three;

import javax.swing.JOptionPane;

public class RaizExata {

	public static void main(String[] args) {
		
		int numero;
		double raiz;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero"));
		raiz = Math.sqrt(numero);
		
		if (numero % raiz == 0) {
            JOptionPane.showMessageDialog(null, "Há raiz exata para " + numero + " e é " + (int) raiz);
        }else {
            JOptionPane.showMessageDialog(null, "Não há raiz exata para " + numero);
        }
	}

}

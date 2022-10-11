package com.curso1.unidade_four;

import javax.swing.JOptionPane;

public class NumeroPrimo {

	public static void main(String[] args) {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número"));
		int numero_divisores = 0;
		
		for(int i =1; i <= numero; i++) {
			if(numero % i == 0){
				numero_divisores++;
            }
		}
		if (numero_divisores == 2){
			JOptionPane.showMessageDialog(null, numero+" é primo");
        } else {
			JOptionPane.showMessageDialog(null, numero+" não é Primo!");
        }
	}

}

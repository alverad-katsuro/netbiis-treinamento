package com.curso1.unidade_three;

import javax.swing.JOptionPane;

public class Numero {

	public static void main(String[] args) {
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor"));

		if (numero%2 == 0)
			System.out.println("É par");
		else
			System.out.println("É impar");
	}

}

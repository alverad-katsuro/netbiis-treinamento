package com.netbiis.unidade_four;

import javax.swing.JOptionPane;

public class CalculaMedia {

	public static void main(String[] args) {
		
		System.out.println("Favor informar o valor");
		float valor = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe um valor"));
		
		float soma_valor = 0;
		int cont = 0;
		
		while(valor != -1) {
			soma_valor = soma_valor + valor;
			cont++;
			
			valor = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe um valor"));
		}
        JOptionPane.showMessageDialog(null, "A média é "+ (soma_valor / cont));
	}

}

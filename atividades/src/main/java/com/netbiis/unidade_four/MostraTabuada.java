package com.netbiis.unidade_four;


import javax.swing.JOptionPane;

public class MostraTabuada {

	public static void main(String[] args) {
		
		int numero, total = 1;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um numero"));
		String resposta = "";
		for(int i=0; i <= 10 ;i++)
		{
			total = numero * i;
            resposta += numero+" x "+i+" = " + total + "\n";
		}
        JOptionPane.showMessageDialog(null, resposta);
	}
}

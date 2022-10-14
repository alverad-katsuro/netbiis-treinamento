package com.curso1.unidade_four;

import javax.swing.JOptionPane;

public class NumeroDecrescente {

	
    /** 
     * @param args
     */
    public static void main(String[] args) {
		
		int numero;
		numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um numero"));
		
        String resp = "";
		for(int i=numero; i >= 0; i--) {
			resp += i + " ";	
        }
        JOptionPane.showMessageDialog(null, resp);
	}
}

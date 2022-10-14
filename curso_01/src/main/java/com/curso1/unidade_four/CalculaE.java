package com.curso1.unidade_four;

import javax.swing.JOptionPane;

public class CalculaE {

	
    /** 
     * @param args
     */
    public static void main(String[] args) {
		
		double x, e = 0;
	
		x = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe um valor para X"));
		
		for(int i = 1; i <= 50; i++){
			e = e + (Math.pow(x, i) / i);
        }
		JOptionPane.showMessageDialog(null, "O valor de E^"+ x + " = " + e);
	}

}

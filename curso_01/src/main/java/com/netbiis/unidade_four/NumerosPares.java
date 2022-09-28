package com.netbiis.unidade_four;

import javax.swing.JOptionPane;

public class NumerosPares {

	public static void main(String[] args) {
		
        int a;
        do {
            a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor"));
			if (a % 2==0){
                JOptionPane.showMessageDialog(null, "O número " + a + " é par!");
            } else {
                JOptionPane.showMessageDialog(null, "O número " + a + " não é par!");
            }
        } while(a > 0);
	}
}

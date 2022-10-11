package com.curso1.unidade_three;

import javax.swing.JOptionPane;

public class Equacao2Grau {

	public static void main(String[] args) {
		int a, b, c;
		double delta, x1, x2;
		
        do {
            a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor de a"));
            if (a == 0){
                JOptionPane.showMessageDialog(null, "Insira um valor diferente que 0");
            }
        } while(a == 0);
		b = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor de b"));
		c = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor de c"));
		
		delta = (b * b) - (4 * a * c);
		
		if(delta >=0 && a > 0) {
			x1 = (-b - Math.sqrt(delta)) / (2 * a);
			x2 = (-b + Math.sqrt(delta)) / (2 * a);
            JOptionPane.showMessageDialog(null, "O valor de x¹ é " + x1);
            JOptionPane.showMessageDialog(null, "O valor de x² é " + x2);
		} else{
            JOptionPane.showMessageDialog(null, "Não há raizes reais para esta equação");
            Equacao2Grau.main(null);
		}
	}
}

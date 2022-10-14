package com.curso1.unidade_three;

import javax.swing.JOptionPane;

public class Triangulo {

	
    /** 
     * @param args
     */
    public static void main(String[] args) {
		float a, b, c;
        a = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o lado a"));
        b = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o lado b"));
        c = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o lado c"));
		
		if ((a < (b + c)) && (b < (a + c)) && ( c < (a + b))) {
			if ((a==b) && (b==c)) {
				JOptionPane.showMessageDialog(null, "Triângulo Equilátero!");
			} else {
				if ((a == b) || (a == c) || (b == c)){
					JOptionPane.showMessageDialog(null, "Triângulo isósceles!");
				} else {
                    JOptionPane.showMessageDialog(null, "Triângulo Escaleno!");
                }
			}
		} else{
            JOptionPane.showMessageDialog(null, "Não é um triângulo");
        }
	}

}

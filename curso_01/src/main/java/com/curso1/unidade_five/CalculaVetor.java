package com.curso1.unidade_five;

import javax.swing.JOptionPane;

public class CalculaVetor {

	public static void main(String[] args) {
		double A[] = new double[10];
		double B[] = new double[10];
		
		for(int i=0; i < 10; i++) {
			A[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor de A["+i+"]"));
			if(i % 2==0){
				B[i] = 2*A[i];
            } else {
				B[i] = A[i]/2;
            }
		}
        String resposta = "";
		for(double valor: A) {
			resposta += "A = "+valor + " \t";
        }
        resposta+="\n";
		for(double valor: B) {
            resposta += "B = "+valor + " \t";
        }
        JOptionPane.showMessageDialog(null, resposta);
		
	}
}

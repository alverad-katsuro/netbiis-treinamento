package com.curso2.unidade2;

import javax.swing.JOptionPane;

public class CalculaVetor {

	public static void main(String[] args) {
		float A[] = new float[50];
		float B[] = new float[50];
		
		for(int i=0; i < 50; i++) {
			A[i] = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor de A["+i+"]"));
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

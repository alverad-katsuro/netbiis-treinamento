package com.curso1.unidade_four;

import javax.swing.JOptionPane;

public class Contas {

	
    /** 
     * @param args
     */
    public static void main(String[] args) {
		
		int numero_contas = -1;
		double saldo, saldo_total = 0;
		String conta;

		do {
			conta = JOptionPane.showInputDialog("Conta");
			saldo = Double.parseDouble(JOptionPane.showInputDialog("Saldo"));
            
			JOptionPane.showMessageDialog(null, "A Conta "+ conta +" tem o saldo de " + saldo);
			numero_contas++;
			saldo_total = saldo_total + saldo;
			
		} while(saldo > 0);
        
		JOptionPane.showMessageDialog(null, "O número de contas=" + numero_contas + " tem o saldo total de R$" + saldo_total);
	}	
}

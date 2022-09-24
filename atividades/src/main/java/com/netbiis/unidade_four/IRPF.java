package com.netbiis.unidade_four;

import javax.swing.JOptionPane;

public class IRPF {

	public static void main(String[] args) {
		
		double irpf, renda_mensal, salario_liquido;
		int numero_dependentes;
		String cpf, nome;
		Repetir repetir = Repetir.CANCELAR;
		do {
			nome = JOptionPane.showInputDialog("Informe seu nome");
			cpf = JOptionPane.showInputDialog("Informe seu CPF");
			numero_dependentes = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de dependentes"));
			renda_mensal = Double.parseDouble(JOptionPane.showInputDialog("Informe sua renda mensal"));
			 
			salario_liquido = renda_mensal - (numero_dependentes * 189.59) - (0.11 * renda_mensal);
			
			if (salario_liquido <= 1903.98) {
				JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nCPF: " + cpf + "\nStatus: Isento");
			} else if ((salario_liquido >= 1903.99) && (salario_liquido <= 2826.65)) {
                irpf = 0.075 * salario_liquido - 142.80;
                JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nCPF: " + cpf + "\nStatus: Pagar R$" + irpf);
			} else if ((salario_liquido >= 2826.66) && (salario_liquido <= 3751.05)) {
				irpf = 0.15*salario_liquido - 354.80;
                JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nCPF: " + cpf + "\nStatus: Pagar R$" + irpf);
			} else if ((salario_liquido >= 3751.06) && (salario_liquido <= 4664.68)) {
				irpf = 0.225*salario_liquido - 636.13;
                JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nCPF: " + cpf + "\nStatus: Pagar R$" + irpf);
			} else {
				irpf = 0.275*salario_liquido - 869.36;
                JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nCPF: " + cpf + "\nStatus: Pagar R$" + irpf);
			}
            repetir = (Repetir) JOptionPane.showInputDialog(null, "Novo contribuente?", "Novo Contribuente?", JOptionPane.QUESTION_MESSAGE, null, Repetir.values(), Repetir.REPETIR);
		} while(repetir == Repetir.REPETIR);
	}
}

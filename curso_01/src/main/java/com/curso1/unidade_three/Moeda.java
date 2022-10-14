package com.curso1.unidade_three;

import javax.swing.JOptionPane;

public class Moeda {

	
    /** 
     * @param args
     */
    public static void main(String[] args) {
		
		double valor;
		MoedaUnidade tipo_moeda;
		
		valor = Double.parseDouble(JOptionPane.showInputDialog("Favor informar o valor a ser convertido"));
		tipo_moeda = (MoedaUnidade) JOptionPane.showInputDialog(null, "Escolha o tipo de moeda", "Escolha da Moeda", JOptionPane.QUESTION_MESSAGE, null, MoedaUnidade.values(), MoedaUnidade.DOLAR);
		
        JOptionPane.showMessageDialog(null, "Valor em euro " + switch (tipo_moeda) {
            case LIBRA -> valor / 5;
            case DOLAR -> valor / 4;
            case EURO -> valor / 4.4;
        });
	}
}

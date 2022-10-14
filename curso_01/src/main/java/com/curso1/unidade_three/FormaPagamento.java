package com.curso1.unidade_three;

import javax.swing.JOptionPane;

public class FormaPagamento {

	
    /** 
     * @param args
     */
    public static void main(String[] args) {
		
        String pagamento[] = {"Avista - 10% Desconto", "Cartão - 5% Desconto", "2x sem juros", "3x com juros de 10%"};
			
        float conta = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da conta"));

        String selecao = (String) JOptionPane.showInputDialog(null, "Selecione a forma de pagamento", "Input", JOptionPane.INFORMATION_MESSAGE, null, pagamento, pagamento[0]);
        
        switch (selecao) {
            case "3x com juros de 10%":{
                JOptionPane.showMessageDialog(null, "O valor a ser pago é: 3x de "+ (conta / 3.0f));
                break;
            }
            case "2x sem juros":{
                JOptionPane.showMessageDialog(null, "O valor a ser pago é: 2x de "+ (conta / 2.0f));
                break;
            }
            case "Cartão - 5% Desconto": {
                JOptionPane.showMessageDialog(null, "O valor a ser pago é: " + (conta * 0.95f));
                break;
            }
            default:{
                JOptionPane.showMessageDialog(null, "O valor a ser pago é: "+ (conta * 0.9f));
                break;
            }
        }
	}
}

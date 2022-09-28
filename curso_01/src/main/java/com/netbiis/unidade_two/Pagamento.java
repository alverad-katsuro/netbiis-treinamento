package com.netbiis.unidade_two;

import javax.swing.JOptionPane;

public class Pagamento {
    public static void main(String[] args) {
        float conta = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da conta"));
        String pagamento[] = {"Avista", "Parcelado"};
        String selecao = (String) JOptionPane.showInputDialog(null, "Selecione a forma de pagamento", "Input", JOptionPane.INFORMATION_MESSAGE, null, pagamento, pagamento[0]);
        switch (selecao) {
            case "Parcelado":
                JOptionPane.showMessageDialog(null, "O valor a ser pago é: 3x de "+ (conta / 3.0f));
                break;
                
                default:
                JOptionPane.showMessageDialog(null, "O valor a ser pago é: "+ (conta * 0.9));
                break;
        }
 
    }
}

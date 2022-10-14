package com.curso1.unidade_two;

import javax.swing.JOptionPane;

public class LanHouse {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        int tempo = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o tempo de permanencia do usuário em minutos: "));
        float preco = (tempo / 15) * 2.0f;
        if (tempo % 15 != 0) {
            preco += 2.0f;
        }
        JOptionPane.showMessageDialog(null, "O valor a ser pago é: R$" + preco, "Valor Total", JOptionPane.INFORMATION_MESSAGE);
    }
}

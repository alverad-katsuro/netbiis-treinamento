package com.curso1.unidade_two;

import javax.swing.JOptionPane;

public class DividirConta {
    public static void main(String[] args) {
        float valor = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor da conta: "));
        int pessoas = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o total de pessoas: "));
        JOptionPane.showMessageDialog(null, "Cada pessoa deve pagar: " + (valor / pessoas));
    }
}

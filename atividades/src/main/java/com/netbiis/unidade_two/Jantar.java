package com.netbiis.unidade_two;

import javax.swing.JOptionPane;

public class Jantar {
    public static void jantar(String[] args) {
        Object[] possibleValues = { 15, 18, 22 };
        float jantar = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o total do jantar:"));
        Object selectedValue = JOptionPane.showInputDialog(null, "Selecione a % da gorjeta", "Input", JOptionPane.INFORMATION_MESSAGE, null, possibleValues, possibleValues[0]);
        float preco_fim = (jantar * (1 + ((int) selectedValue) / 100.0f));
        JOptionPane.showMessageDialog(null, "O jantar custou " + preco_fim);
    }
}
// 15 18 22
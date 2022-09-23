package com.netbiis.unidade_two;

import javax.swing.JOptionPane;

public class Viajem {
    public static void main(String[] args) {
        int dias = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o total de dias: "));
        int horas = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o total de horas: "));
        JOptionPane.showMessageDialog(null, "O total de horas é: " + (dias * 24) + horas);
    }
}

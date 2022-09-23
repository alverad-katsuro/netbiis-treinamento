package com.netbiis.unidade_two;

import javax.swing.JOptionPane;

public class AnteriorPosterior {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número: "));
        JOptionPane.showMessageDialog(null, "Anterior: "+ (numero - 1) + "\nAtual: "+ numero +"\nPosterior: "+ (numero +1));
    }
}

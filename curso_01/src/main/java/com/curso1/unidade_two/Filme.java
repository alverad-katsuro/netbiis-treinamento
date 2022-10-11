package com.curso1.unidade_two;

import javax.swing.JOptionPane;

public class Filme {
    public static void main(String[] args) {
        String nome_filme = JOptionPane.showInputDialog("Digite o nome do filme");
        int horas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de horas"));
        int minutos = Integer.parseInt(JOptionPane.showInputDialog("Digite o total de minutos"));
        JOptionPane.showMessageDialog(null, "O filme "+nome_filme+" tem "+((horas * 60) + minutos)+" minutos \n");
    }
}

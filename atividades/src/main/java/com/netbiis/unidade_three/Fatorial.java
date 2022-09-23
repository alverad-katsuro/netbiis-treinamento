package com.netbiis.unidade_three;

import javax.swing.JOptionPane;

public class Fatorial {
    public static void main(String[] args) {
        int fatorial = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor para calcular o fatorial"));
        JOptionPane.showMessageDialog(null, "O resultado do fatorial é " + fatorial(fatorial));
    }

    public static int fatorial(int n){
        if (n == 0) {
            return 1;
        } else {
            return n * fatorial(n - 1);
        }
    }
}

package com.netbiis.desafio_final.desafio_02;

import javax.swing.JOptionPane;

public class Parte_um {
    public static void main(String[] args) {
        int contador = 0;
        int valor;
        valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor"));
        for (int i = 1; i <= valor; i++) {
            contador += i;
        }
        JOptionPane.showMessageDialog(null, contador);
    }
}

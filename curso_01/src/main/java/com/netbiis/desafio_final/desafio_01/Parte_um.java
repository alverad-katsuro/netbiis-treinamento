package com.netbiis.desafio_final.desafio_01;

import javax.swing.JOptionPane;

public class Parte_um {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Desafio 1");
        int contador = 1;
        for (int i = 1; i <= 20; i++) {
            System.out.println(contador);
            contador = contador + i;    
        }
    }
}

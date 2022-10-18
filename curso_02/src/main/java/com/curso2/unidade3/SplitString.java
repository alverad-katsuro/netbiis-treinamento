package com.curso2.unidade3;

import javax.swing.JOptionPane;

/**
 * DividirString
 */
public class SplitString {

    public static void main(String[] args) {
        String inp = JOptionPane.showInputDialog(null, "Digite uma palavra para dividir nos caracter '/'");
        int contador = 0;
        for (String string : inp.split("/")) {
            JOptionPane.showMessageDialog(null, String.format("Parte %d - %s", contador, string));
            contador++;
        }
    }
}
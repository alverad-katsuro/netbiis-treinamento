package com.curso1.desafio_final.desafio_01;

import javax.swing.JOptionPane;

public class Parte_dois {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Desafio 1");
        int inicial = 2;
        int contador = 1;
        System.out.println(inicial);
        for (int i = 0; i < 20; i++) {
            inicial = inicial + contador;
            System.out.println(inicial);
            contador = contador + 2;
        }
    }
}

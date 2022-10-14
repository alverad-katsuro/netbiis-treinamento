package com.curso1.desafio_final.desafio_02;

import javax.swing.JOptionPane;

public class Parte_dois {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        int valor;
        valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor"));
        JOptionPane.showMessageDialog(null, rec(valor));
    }

    
    /** 
     * @param n
     * @return int
     */
    public static int rec(int n){
        if (n == 0) {
            return n;
        } else {
            return n + rec(n - 1);
        }
    }
}

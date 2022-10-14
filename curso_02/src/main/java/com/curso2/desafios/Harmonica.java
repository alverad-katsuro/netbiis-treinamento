package com.curso2.desafios;

import javax.swing.JOptionPane;

public class Harmonica {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero inteiro"));
        JOptionPane.showMessageDialog(null, "O valor hamonico pra o valor digitado é " + harmonico(n));
    }

    
    /** 
     * @param n
     * @return double
     */
    public static double harmonico(int n){
        double resultado = 0;
        for (int i = 1; i <= n; i++) {
            resultado += (1.0 / i);
        }
        System.out.println(resultado);
        return resultado;
    }
}

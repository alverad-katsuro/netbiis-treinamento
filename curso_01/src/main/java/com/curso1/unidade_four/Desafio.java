package com.curso1.unidade_four;

import javax.swing.JOptionPane;

public class Desafio {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        double x = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um valor pra X"));
        JOptionPane.showMessageDialog(null, "A resposta é " + sen(x));
    }

    
    /** 
     * @param x
     * @return double
     */
    public static double sen(double x){
        int exp = 1;
        boolean impa = true;
        double resposta = 0;
        for (int i = 1; i <= 30; i++) {
            if (impa) {
                resposta = resposta + (Math.pow(x, exp) / Fatorial.fatorial_int(exp));
                impa = false;
            } else {
                resposta = resposta - (Math.pow(x, exp) / Fatorial.fatorial_int(exp));
                impa = true;
            }
            exp = exp + 2;
        }
        return resposta;
    }

}

package com.curso1.unidade_four;

import javax.swing.JOptionPane;

public class Fatorial {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        int fatorial = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor para calcular o fatorial"));
        JOptionPane.showMessageDialog(null, "O resultado do fatorial é " + fatorial(fatorial));
    }

    
    /** 
     * @param n
     * @return int
     */
    public static int fatorial(int n){
        if (n == 0) {
            return 1;
        } else {
            return n * fatorial(n - 1);
        }
    }

    
    /** 
     * @param n
     * @return int
     */
    public static int fatorial_int(int n){
        int resp = n;

        for (int i = n - 1; i > 0; i--) {
            resp = resp * i;
        }

        return resp;
    }
}

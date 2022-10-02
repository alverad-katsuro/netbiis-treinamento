package com.curso2.unidade2;

import javax.swing.JOptionPane;

public class Fibo {

    public static void main(String[] args) {
        fibo(5);
    }

    static long fibo(int n) {
        int atual = 0;
        int anterior = 0;
        float media = 0;
        for (int i = 1; i <= n; i++) {
            media += atual;
            if (i == 1) {
                atual = 1;
                anterior = 0;
            } else {
                atual += anterior;
                anterior = atual - anterior;
            }

        }
        media = media / n;
        JOptionPane.showMessageDialog(null, "Fibonacia = " + atual + "\nMedia = " + media + "\n");

        return atual;
    }
}

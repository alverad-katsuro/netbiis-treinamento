package com.curso1.unidade_three;

import javax.swing.JOptionPane;

public class Fibo {
    public static void main(String[] args) {
        int valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha um indice de fibbonaci para exibir"));
        JOptionPane.showMessageDialog(null, "O valor desta posição é: " + fibo(valor));
    }
    public static int fibo(int n) {
        if (n <= 1) {
            System.out.println(n);
            return n;
        } else {
            int temp = fibo(n - 2) + fibo(n - 1);
            System.out.println(temp);
            return temp;
        }
    }
}

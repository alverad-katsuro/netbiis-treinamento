package com.curso1.desafio_final.desafio_03;

import javax.swing.JOptionPane;

public class Parte_dois {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        int contador = 1;
        String palavra = JOptionPane.showInputDialog(null, "Digite uma frase ou 0 para exibir o alfabeto");
        if (!palavra.equals("0")) {
            for (char p : palavra.toCharArray()) {
                System.out.printf("%c = %c \n", p, p + contador);
                contador++;
            }
        } else {
            for (int i = 0; i < 26; i++) {
                if ((i + contador) >= 26){
                    System.out.printf("%c = %c \n", 97 + i, 97 + ((i + contador) % 26));
                } else {
                    System.out.printf("%c = %c \n", 97 + i, 97 + (i + contador));
                }
                contador++;
            }
        }
    }
}

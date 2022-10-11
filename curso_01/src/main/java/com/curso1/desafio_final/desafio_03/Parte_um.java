package com.curso1.desafio_final.desafio_03;

public class Parte_um {
    public static void main(String[] args) {
        for (int i = 97; i <= 122; i++) {
            if (i == 122) {
                System.out.printf("%c = %c \n", i, (i - 25));
            } else {
                System.out.printf("%c = %c \n", i, (i + 1));
            }
            
        }
    }
    
}

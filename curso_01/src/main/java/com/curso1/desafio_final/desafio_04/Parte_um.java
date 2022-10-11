package com.curso1.desafio_final.desafio_04;

import java.util.Random;

public class Parte_um {
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        Random g = new Random();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = g.nextInt(100);
                System.out.printf("%dx%d = %d\n", i, j, matrix[i][j]);
            }
        }
        int menor = matrix[0][0], maior = matrix[0][0];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (menor > matrix[i][j]){
                    menor = matrix[i][j];
                }
                if (maior < matrix[i][j]){
                    maior = matrix[i][j];
                }
            }
        }
        System.out.println(menor);
        System.out.println(maior);
    }
}

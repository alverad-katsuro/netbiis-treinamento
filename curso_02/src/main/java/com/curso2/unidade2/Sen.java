package com.curso2.unidade2;

public class Sen {
    public static void main(String[] args) {
        System.out.println(sen(2));
    }
    public static double sen(double x){
        double resposta = 0;
        for (int i = 1; i <= 50; i++) {
            resposta = resposta + (Math.pow(x, i) / i);
        }
        return resposta;
    }
}

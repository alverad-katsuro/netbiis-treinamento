package com.curso2.unidade2;

public class Sen {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(sen(2));
    }
    
    /** 
     * @param x
     * @return double
     */
    public static double sen(double x){
        double resposta = 0;
        for (int i = 1; i <= 50; i++) {
            resposta = resposta + (Math.pow(x, i) / i);
        }
        return resposta;
    }
}

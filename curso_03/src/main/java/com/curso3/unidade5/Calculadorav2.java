package com.curso3.unidade5;

public class Calculadorav2 implements Formula {
    public static void main(String[] args) {
        Calculadorav2 ex = new Calculadorav2();
        IMath somar = (a,b)-> a+b; //Expressão Lambda
        IMath subtrair = (a,b)-> a-b; //Expressão Lambda
        IMath multiplicar = (a,b)-> a*b; //Expressão Lambda
        IMath dividir = (a,b)-> a/b; //Expressão Lambda
        IMath exponenciacao = (a,b)-> Math.pow(a, b); //Expressão Lambda
        IMath radiciacao = (a,b)-> Math.pow(a, (1/b)); //Expressão Lambda
        System.out.println(ex.execOperacao(5, 5, somar));
        System.out.println(ex.execOperacao(6, 4, subtrair));
        System.out.println(ex.execOperacao(3, 4, multiplicar));
        System.out.println(ex.execOperacao(10, 2, dividir));
        System.out.println(ex.execOperacao(10, 2, exponenciacao));
        System.out.println(ex.execOperacao(10, 2, radiciacao));
    }
    
    public double execOperacao(double a, double b, IMath op) {
        return op.operacao(a, b);
    }

    @Override
    public double calcular(int a) {
        // TODO Auto-generated method stub
        return 0;
    }
}

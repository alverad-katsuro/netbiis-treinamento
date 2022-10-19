package com.curso2.desafios;

import javax.swing.JOptionPane;

import com.curso2.unidade2.Opcoes;

public class Calculadora {

    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        float x = Float.MIN_NORMAL, y = Float.MIN_NORMAL;
        boolean a = true, b = true;
        Opcoes resposta;
        resposta = (Opcoes) JOptionPane.showInputDialog(null, "Escolha uma operação", "Calculadora", JOptionPane.QUESTION_MESSAGE, null, Opcoes.values(), Opcoes.SOMAR);
        String valores_logicos[] = { "TRUE", "FALSE" };
        while (resposta != Opcoes.CANCELAR) {
            if (resposta == Opcoes.E || resposta == Opcoes.OU){
                a = Boolean.parseBoolean( (String) JOptionPane.showInputDialog(null, "Selecione o primeiro valor boolean", "Calculadora Logica", JOptionPane.QUESTION_MESSAGE, null, valores_logicos, valores_logicos[0]));
                b = Boolean.parseBoolean( (String) JOptionPane.showInputDialog(null, "Selecione o segundo valor boolean", "Calculadora Logica", JOptionPane.QUESTION_MESSAGE, null, valores_logicos, valores_logicos[0]));

            } else {
                x = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor de x"));
                y = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor de y"));
            }
            JOptionPane.showMessageDialog(null, 
            switch (resposta) {
                case SOMAR -> {yield "O resultado é " + soma(x, y);}
                case SUBTRAIR -> { yield "O resultado é " + subtracao(x, y);}
                case DIVIDIR -> {yield "O resultado é " + divisao(x, y);}
                case MULTIPLICAR -> { yield "O resultado é " + multiplicacao(x, y);}
                case CANCELAR -> {yield "Saindo da calculadora";}
                case MAIOR_OU_IGUAL -> {yield "O resultado é " + maiorIgual(x, y);}
                case MAIOR -> {yield "O resultado é " + maior(x, y);}
                case MENOR -> {yield "O resultado é " + menor(x, y);}
                case E -> {yield "O resultado é " + E(a, b);}
                case OU -> {yield "O resultado é " + OU(a, b);}
            });
            resposta = (Opcoes) JOptionPane.showInputDialog(null, "Escolha um", "aaaa", JOptionPane.QUESTION_MESSAGE, null, Opcoes.values(), Opcoes.SOMAR);
        };
    }
    
    
    /** 
     * @param x
     * @param y
     * @return float
     */
    public final static float soma(float x, float y) {
        return x + y;
    }

    
    /** 
     * @param x
     * @param y
     * @return float
     */
    public final static float subtracao(float x, float y) {
        return x - y;
    }

    
    /** 
     * @param x
     * @param y
     * @return float
     */
    public final static float multiplicacao(float x, float y) {
        return x * y;
    }

    
    /** 
     * @param x
     * @param y
     * @return float
     */
    public final static float divisao(float x, float y) {
        return x / y;
    }

    
    /** 
     * @param x
     * @param y
     * @return boolean
     */
    public final static boolean maior(float x, float y) {
        return x > y;
    }

    
    /** 
     * @param x
     * @param y
     * @return boolean
     */
    public final static boolean menor(float x, float y) {
        return x < y;
    }

    
    /** 
     * @param x
     * @param y
     * @return boolean
     */
    public final static boolean maiorIgual(float x, float y) {
        return x >= y;
    }
    
    /** 
     * @param x
     * @param y
     * @return boolean
     */
    public final static boolean E(boolean x, boolean y) {
        return x && y;
    }
    
    /** 
     * @param x
     * @param y
     * @return boolean
     */
    public final static boolean OU(boolean x, boolean y) {
        return x || y;
    }
}

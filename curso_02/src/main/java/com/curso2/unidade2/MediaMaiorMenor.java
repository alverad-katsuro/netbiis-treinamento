package com.curso2.unidade2;

import javax.swing.JOptionPane;

public class MediaMaiorMenor {
    
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        resultados(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
    }

    
    /** 
     * @param ...valores
     */
    public static void resultados(float ...valores) {
        float maior = Float.MIN_VALUE;
        float menor = Float.MAX_VALUE;
        float media = 0;
        for (float f : valores) {
            if (f > maior) {
                maior = f;
            }
            if (f < menor){
                menor = f;
            }
            if (f == -1) {
                break;
            } else {
                media += f;
            }
        }
        media = media / valores.length;
        JOptionPane.showMessageDialog(null, "Media = " + media + "\nMaior = " + maior + "\nMenor = " + menor + "\n");
    }
}

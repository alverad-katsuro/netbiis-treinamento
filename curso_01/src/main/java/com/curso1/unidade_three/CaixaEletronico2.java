package com.curso1.unidade_three;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class CaixaEletronico2 {

	
    /** 
     * @param args
     */
    public static void main(String[] args) {
        byte notas_de_100 = 0, notas_de_50 = 0, notas_de_10 = 0, notas_de_2 = 0;
		int saque, resto;
        ArrayList<String> notas = new ArrayList<String>();
		saque = Integer.parseInt(JOptionPane.showInputDialog("Favor informar o valor do saque"));
		
		if (saque%2 == 0) {
            if (Math.floor(saque / 100) > 0){
                notas.add("cem");
            }
            if (Math.floor(saque / 50) > 0){
                notas.add("cinquenta");
            }
            if (Math.floor(saque / 10) > 0){
                notas.add("dez");
            }
            if (Math.floor(saque / 2) > 0){
                notas.add("dois");
            }
            String escolha = (String) JOptionPane.showInputDialog(null, "Escolha a maior nota para o saque", "Input", JOptionPane.INFORMATION_MESSAGE, null, notas.toArray(), notas.get(0));

            switch (escolha) {
                case "cem": {
                    notas_de_100 = (byte) Math.floor(saque/100);
                    resto = saque % 100;
                    notas_de_50 = (byte) Math.floor(resto/50); 
                    resto = resto % 50;
                    notas_de_10 = (byte) Math.floor(resto/10); 
                    resto = resto % 10;
                    notas_de_2 = (byte) Math.floor(resto/2); 
                    break;
                }
                case "cinquenta": {
                    notas_de_50 = (byte) Math.floor(saque/50); 
                    resto = saque % 50;
                    notas_de_10 = (byte) Math.floor(resto/10); 
                    resto = resto % 10;
                    notas_de_2 = (byte) Math.floor(resto/2);
                    break;
                }
                case "dez": {
                    notas_de_10 = (byte) Math.floor(saque/10); 
                    resto = saque % 10;
                    notas_de_2 = (byte) Math.floor(resto/2);
                    break;
                }
                case "dois": {
                    notas_de_2 = (byte) Math.floor(saque/2);
                    break;
                }   
            }
            /*
             
            boolean possiveis_notas[] = new boolean[4];

            notas_de_100 = (byte) Math.floor(saque/100);
            resto = saque % 100;
            notas_de_50 = (byte) Math.floor(resto/50); 
            resto = resto % 50;
            notas_de_10 = (byte) Math.floor(resto/10); 
            resto = resto % 10;
            notas_de_2 = (byte) Math.floor(resto/2); 
            */
            String resultado = "";
            if (notas_de_100 > 0) {
                resultado += "Notas de 100 sacadas: " + notas_de_100 + "\n";
            }
            if (notas_de_50 > 0){
                resultado += "Notas de 50 sacadas: " + notas_de_50 + "\n";
            }
            if (notas_de_10 > 0){
                resultado += "Notas de 10 sacadas: " + notas_de_10 + "\n";
            }
            if (notas_de_2 > 0){
                resultado += "Notas de 2 sacadas: " + notas_de_2 + "\n";
            }
            JOptionPane.showMessageDialog(null, resultado);
        } else {
			System.out.println("Valor informado do saque está incorreto");
        }
    }
}
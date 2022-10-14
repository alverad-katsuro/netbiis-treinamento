package com.curso1.desafio_final.desafio_05;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Caixa1 {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        byte notas_de_200 = 0, notas_de_100 = 0, notas_de_50 = 0;
		int saque, resto;
        ArrayList<String> notas = new ArrayList<String>();
		saque = Integer.parseInt(JOptionPane.showInputDialog("Favor informar o valor do saque"));
		
		if (saque % 50 == 0) {
            if (Math.floor(saque / 200) > 0){
                notas.add("R$200");
            }
            if (Math.floor(saque / 100) > 0){
                notas.add("R$100");
            }
            if (Math.floor(saque / 50) > 0){
                notas.add("R$50");
            }
            String escolha = (String) JOptionPane.showInputDialog(null, "Escolha a maior nota para o saque", "Input", JOptionPane.INFORMATION_MESSAGE, null, notas.toArray(), notas.get(0));

            switch (escolha) {
                case "R$200": {
                    notas_de_200 = (byte) Math.floor(saque/200);
                    resto = saque % 200;
                    notas_de_100 = (byte) Math.floor(resto/100);
                    resto = saque % 100;
                    notas_de_50 = (byte) Math.floor(resto/50); 
                    resto = resto % 50;
                    break;
                }
                case "R$100": {
                    notas_de_100 = (byte) Math.floor(saque/100);
                    resto = saque % 100;
                    notas_de_50 = (byte) Math.floor(resto/50); 
                    resto = resto % 50;
                    break;
                }
                case "R$50": {
                    notas_de_50 = (byte) Math.floor(saque/50); 
                    resto = saque % 50;
                    break;
                }
            }
            String resultado = "";
            if (notas_de_200 > 0) {
                resultado += "Notas de R$200 sacadas: " + notas_de_200 + "\n";
            }
            if (notas_de_100 > 0) {
                resultado += "Notas de R$100 sacadas: " + notas_de_100 + "\n";
            }
            if (notas_de_50 > 0){
                resultado += "Notas de R$50 sacadas: " + notas_de_50 + "\n";
            }
            JOptionPane.showMessageDialog(null, resultado);
        } else {
			JOptionPane.showMessageDialog(null, "Valor informado do saque não permitido");
            Caixa1.main(null);
        }
    }    
}

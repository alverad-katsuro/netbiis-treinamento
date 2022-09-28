package com.netbiis.unidade_three;

import javax.swing.JOptionPane;

public class CaixaEletronico {

	public static void main(String[] args) {
        byte notas_de_100, notas_de_50, notas_de_10, notas_de_2;
		int saque, resto;
		
		saque = Integer.parseInt(JOptionPane.showInputDialog("Favor informar o valor do saque"));
		
        
		if (saque%2 == 0) {
            notas_de_100 = (byte) Math.floor(saque/100);
            resto = saque % 100;
            notas_de_50 = (byte) Math.floor(resto/50); 
            resto = resto % 50;
            notas_de_10 = (byte) Math.floor(resto/10); 
            resto = resto % 10;
            notas_de_2 = (byte) Math.floor(resto/2); 
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
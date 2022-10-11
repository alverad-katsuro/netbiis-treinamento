package com.curso1.desafio_final.desafio_05;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Caixa2 {
    public static void main(String[] args) {
        byte notas_de_200 = 0, notas_de_100 = 0, notas_de_50 = 0, notas_de_10 = 0, notas_de_2 = 0;
		int saque, resto;
        ArrayList<String> notas = new ArrayList<String>();
        ArrayList<String> respostas2 = new ArrayList<String>();
		saque = Integer.parseInt(JOptionPane.showInputDialog("Favor informar o valor do saque"));
		
		if (saque%2 == 0) {
            if (Math.floor(saque / 200) > 0){
                notas.add("R$200");
            }
            if (Math.floor(saque / 100) > 0){
                notas.add("R$100");
            }
            if (Math.floor(saque / 50) > 0){
                notas.add("R$50");
            }
            if (Math.floor(saque / 10) > 0){
                notas.add("R$10");
            }
            if (Math.floor(saque / 2) > 0){
                notas.add("R$2");
            }
            if (notas.contains("R$200") && notas.contains("R$100") && notas.contains("R$50") && saque % 50 == 0){
                respostas2.add("Notas de [R$200][R$100][R$50]");
            }
            if (notas.contains("R$10") && notas.contains("R$100") && notas.contains("R$50")  && saque % 10 == 0){
                respostas2.add("Notas de [R$100][R$50][R$10]");
            }
            if (notas.contains("R$10") && notas.contains("R$2") && notas.contains("R$50")  && saque % 2 == 0){
                respostas2.add("Notas de [R$50][R$10][R$2]");
            }
            String escolha = (String) JOptionPane.showInputDialog(null, "Escolha a maior nota para o saque", "Input", JOptionPane.INFORMATION_MESSAGE, null, respostas2.toArray(), respostas2.get(0));

            switch (escolha) {
                case "Notas de [R$200][R$100][R$50]": {
                    notas_de_200 = (byte) Math.floor(saque/200);
                    resto = saque % 200;
                    notas_de_100 = (byte) Math.floor(resto/100);
                    resto = saque % 100;
                    notas_de_50 = (byte) Math.floor(resto/50); 
                    resto = resto % 50;
                    break;
                }
                case "Notas de [R$100][R$50][R$10]": {
                    notas_de_100 = (byte) Math.floor(saque/100);
                    resto = saque % 100;
                    notas_de_50 = (byte) Math.floor(resto/50); 
                    resto = resto % 50;
                    notas_de_10 = (byte) Math.floor(resto/10); 
                    break;
                }
                case "Notas de [R$50][R$10][R$2]": {
                    notas_de_50 = (byte) Math.floor(saque/50); 
                    resto = saque % 50;
                    notas_de_10 = (byte) Math.floor(resto/10); 
                    resto = resto % 10;
                    notas_de_2 = (byte) Math.floor(resto/2);
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
            if (notas_de_10 > 0){
                resultado += "Notas de R$10 sacadas: " + notas_de_10 + "\n";
            }
            if (notas_de_2 > 0){
                resultado += "Notas de R$2 sacadas: " + notas_de_2 + "\n";
            }
            JOptionPane.showMessageDialog(null, resultado);
        } else {
			JOptionPane.showMessageDialog(null, "Valor informado do saque não permitido");
            Caixa2.main(null);
        }
    }
}

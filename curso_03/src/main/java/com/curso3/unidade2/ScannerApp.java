package com.curso3.unidade2;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ScannerApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float media = 0;
		for (int i = 0; i < 4; i++) {
			System.out.printf("Digite o valor da %d nota :", i + 1);
			media += Float.parseFloat(scan.nextLine());
		}
		JOptionPane.showMessageDialog(null, String.format("A média do aluno é %.2f", (media/4)));
        scan.close();
		
	}
}

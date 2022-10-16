package com.curso3.unidade2;

import java.io.FileReader;

import javax.swing.JOptionPane;

public class ScannerAppv2 {
	public static void main(String[] args) {
		int c;
		String temp = "";
		float total = 0;
		try {
			FileReader leitor = new FileReader("src/unidade2/numeros.txt");
			while ((c = leitor.read() ) != -1) {
				if (" ".equals(Character.toString((char) c))) {
					total += Float.parseFloat(temp);
					temp = "";
				} else {
					temp += (char) c;
				}
			}			
			JOptionPane.showMessageDialog(null, "O valor total é " + total);
			leitor.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

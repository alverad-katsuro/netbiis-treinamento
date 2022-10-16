package com.curso3.unidade2;

import java.io.FileReader;

import javax.swing.JOptionPane;

public class StreamApp {
	public static void main(String[] args) {
		int caracter = 0;
		int c;
		int conta_letra = 0;
		String letra = JOptionPane.showInputDialog(null, "Digite um caracter para contar");
		try {
			FileReader leitor = new FileReader("src/unidade2/AloMundo.java");
			while ((c = leitor.read() ) != -1) {
				if (letra.equals(Character.toString((char) c))) {
					conta_letra++;
				}
				caracter++;
			}			
			JOptionPane.showMessageDialog(null, "O número de total de caracteres é " + caracter + "\nÉ há " + conta_letra + " " + letra);
			leitor.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

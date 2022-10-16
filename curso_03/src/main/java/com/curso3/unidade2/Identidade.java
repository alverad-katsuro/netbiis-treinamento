package com.curso3.unidade2;

import java.awt.Graphics;

import javax.swing.JApplet;
import javax.swing.JOptionPane;
@SuppressWarnings("removal")
public class Identidade extends JApplet {
	public void paint(Graphics g){
		String resposta = "";
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i == j) {
					resposta += " 1";
				} else {
					resposta += " 0";
				}
			}
			resposta += "\n";
		}
		
		JOptionPane.showMessageDialog(rootPane, resposta);
		System.exit(0);
	}
}

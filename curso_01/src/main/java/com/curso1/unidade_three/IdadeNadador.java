package com.curso1.unidade_three;

import javax.swing.JOptionPane;

public class IdadeNadador {

	public static void main(String[] args) {
		

		byte idade = Byte.parseByte(JOptionPane.showInputDialog(null,"Digite a idade do atleta"));
		
		if ((idade >=0) && (idade <=100)){
			if (idade <=5){
                JOptionPane.showMessageDialog(null, "Infantil A");
			}else if (idade <=8){
                JOptionPane.showMessageDialog(null, "Infantil B");
			}else if (idade <=11){
                JOptionPane.showMessageDialog(null, "Infantil C");
			}else if (idade <=13){
                JOptionPane.showMessageDialog(null, "Juvenil A");
			}else if (idade <=17){
                JOptionPane.showMessageDialog(null, "Juvenil B");
			} else {
                JOptionPane.showMessageDialog(null, "Adulto");
            }
		} else {
			JOptionPane.showMessageDialog(null, "Idade Invalida");
			AvaliacaoNota.main(null);
		}	
	}

}

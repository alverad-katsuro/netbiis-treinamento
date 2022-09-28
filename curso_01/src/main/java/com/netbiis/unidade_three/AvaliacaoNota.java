package com.netbiis.unidade_three;

import javax.swing.JOptionPane;

public class AvaliacaoNota {

	public static void main(String[] args) {
		
		float nota = Float.parseFloat((JOptionPane.showInputDialog(null,"Digite a nota:")));
		
		if ((nota >=0) && (nota<=100)) {
			if (nota >=90){
                JOptionPane.showMessageDialog(null, "Conteico: excelente");
            } else if (nota >=70){
                JOptionPane.showMessageDialog(null, "Conteico: bom");
            }else if (nota >=50){
                JOptionPane.showMessageDialog(null, "Conteico: regular");
            }else{ 
                JOptionPane.showMessageDialog(null, "Conteico: insuficiente");
            }
		} else {
            JOptionPane.showMessageDialog(null, "Nota Invalida");
			AvaliacaoNota.main(null);
		}	
	}
}

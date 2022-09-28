package com.netbiis.unidade_five;

import javax.swing.JOptionPane;

import com.netbiis.unidade_four.MostraTabuada;

public class Matematica {

	public static void tabuada(int numero)
	{
		MostraTabuada.tabuada(numero);
	}
	
	public static void main(String[] args) {
		int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a nota do aluno"));
		tabuada(numero);
    }
}

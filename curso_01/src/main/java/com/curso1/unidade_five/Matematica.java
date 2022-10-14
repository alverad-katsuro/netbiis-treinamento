package com.curso1.unidade_five;

import javax.swing.JOptionPane;

import com.curso1.unidade_four.MostraTabuada;

public class Matematica {

	
    /** 
     * @param numero
     */
    public static void tabuada(int numero)
	{
		MostraTabuada.tabuada(numero);
	}
	
	
    /** 
     * @param args
     */
    public static void main(String[] args) {
		int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a nota do aluno"));
		tabuada(numero);
    }
}

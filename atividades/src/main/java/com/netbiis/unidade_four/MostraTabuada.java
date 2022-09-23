package com.netbiis.unidade_four;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class MostraTabuada {

	public static void main(String[] args) {
		
		int i, numero, total = 1;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Favor informar o n�mero");
		numero = teclado.nextInt();
		
		for(i=1;i<=10;i++)
		{
			total = numero * i;
			//System.out.println("N�mero:"+numero+"x"+i+"="+total);
			JOptionPane.showMessageDialog(null,"N�mero:"+numero+"x"+i+"="+total);
		}
		teclado.close();
	}
}

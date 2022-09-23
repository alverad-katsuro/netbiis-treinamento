package com.netbiis.unidade_four;

import java.util.Scanner;

public class NumeroEstrelas {

	public static void main(String[] args) {
		
		int i, numero_linhas;
		String estrela = "*";
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Favor informar o n�mero de linhas");
		numero_linhas = teclado.nextInt();
		
		for(i=1; i<=numero_linhas;i++)
		{
			System.out.println(estrela);
			estrela = estrela + "*";
		}
		teclado.close();
	}
}

package com.netbiis.unidade_four;

import java.util.Scanner;

public class NumeroDecrescente {

	public static void main(String[] args) {
		
		int numero;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Favor informar o n�mero");
		numero = teclado.nextInt();
		
		for(int i=numero; i>=1; i=i-1)
			System.out.println("N�mero="+i);	
		teclado.close();
	}
}

package com.netbiis.unidade_four;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		
		double fatorial = 1;
		int numero, i;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Favor informar o n�mero");
		numero = teclado.nextInt();
		i = numero;
		while (i >=1)
		{
			fatorial = fatorial * i;
			i--; // numero = numero - 1;
		}
		System.out.println("O fatorial do n�mero:"+numero+"="+fatorial);
		teclado.close();
	}
}

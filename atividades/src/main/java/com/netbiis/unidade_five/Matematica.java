package com.netbiis.unidade_five;

import java.util.Scanner;

public class Matematica {

	public static void tabuada(int numero)
	{
		int total;
		for(int i=1;i<=10;i++)
		{
			total = numero * i;
			System.out.println("N�mero:"+numero+"x"+i+"="+total);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Favor informar a nota do aluno");
		int numero = teclado.nextInt();
		tabuada(numero);
		teclado.close();
	}
}

package com.netbiis.unidade_four;

import java.util.Scanner;

public class NumerosPares {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Favor informar o n�mero A");
		int a = teclado.nextInt();
		
		System.out.println("Favor informar o n�mero B");
		int b = teclado.nextInt();
		
		for(int i=a;i<=b;i++)
		{
			if (i%2==0) //� par?
				System.out.println("O n�mero:"+i+" � par!");
		}
		teclado.close();
	}
}

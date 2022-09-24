/**************************************/
/* Autor: Antonio Sampaio Jr          */
/* Data: 20/07/2018                   */
/* Esta classe calcula a sequencia de */  
/* Fibonacci.                         */
/**************************************/

package com.netbiis.unidade_five;

import java.util.Scanner;

public class Fibonacci {

	public static void fibo(int numero)
	{
		int s1 = 1;
		int s2 = 1;
		int s = 0;
		System.out.print(s1+","+s2+",");
		for(int i =3; i<=numero; i++)
		{ //In�cio
			s = s1 + s2;
			s1 = s2;
			s2 = s;
			System.out.print(s+",");
		}		
	}
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Favor informar o n�mero");
		int numero = teclado.nextInt();
		fibo(numero);
		teclado.close();
	}
}

package com.netbiis.unidade_five;

import java.util.Scanner;

public class CalculaVetor {

	public static void main(String[] args) {
		int i;
		double A[] = new double[10];
		double B[] = new double[10];
		Scanner teclado = new Scanner(System.in);
		
		for(i=0;i<10;i++)
		{
			System.out.println("Favor informar o valor de A["+i+"]");
			A[i] = teclado.nextDouble();
			//alimentar o vetor B
			if(i%2==0) //� par?
				B[i] = 2*A[i];
			else
				B[i] = A[i]/2;
		}
		for(double valor: A)
			System.out.print("A="+valor);
		System.out.println("************");
		for(double valor: B)
			System.out.print("B="+valor);	
		
		teclado.close();
	}
}

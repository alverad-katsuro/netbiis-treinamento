package com.netbiis.unidade_four;

import java.util.Scanner;

public class CalculaMedia {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Favor informar o valor");
		var valor = teclado.nextInt();
		
		var soma_valor = 0;
		var cont = 0;
		
		while(valor != -1)
		{
			soma_valor = soma_valor + valor;
			cont++;
			
			System.out.println("Favor informar o valor");
			valor = teclado.nextInt();			
		}
		System.out.println("M�dia="+soma_valor/cont);
		teclado.close();
	}

}

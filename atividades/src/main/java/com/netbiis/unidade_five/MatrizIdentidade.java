package com.netbiis.unidade_five;

import java.io.FileWriter;
import java.io.PrintWriter;

public class MatrizIdentidade {

	public static void main(String[] args) throws Exception {
		int i,j;
		int I[][] = new int[3][3];
		
		for(i=0;i<3;i++)
			for(j=0;j<3;j++)
			{
				if (i == j)
					I[i][j] = 1;
				else
					I[i][j] = 0;
			}
		
		FileWriter arq = new FileWriter("matriz.txt");
		PrintWriter gravaarq = new PrintWriter(arq);
		
		for (i=0;i<3;i++) 
		{
			for(j=0;j<3;j++)
				gravaarq.print(I[i][j]);    
			gravaarq.println();
		}
		arq.close();
		gravaarq.close();	
		
	}
}

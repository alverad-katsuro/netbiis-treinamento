package com.netbiis.unidade_five;

import java.io.FileWriter;
import java.io.PrintWriter;

public class MatrizIdentidade {

	public static void main(String[] args) throws Exception {
		int identidade[][] = new int[3][3];
		
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++) {
				if (i == j){
                    identidade[i][j] = 1;
                } else {
                    identidade[i][j] = 0;
                }
			}
        }
		
		PrintWriter escrever = new PrintWriter(new FileWriter("matriz.csv"));
		escrever.println("X,Y,Z");
		for (int l = 0; l < 3; l++) {
			for(int c = 0; c < 3; c++){
                escrever.print(identidade[l][c]);    
                if (c < 2) {
                    escrever.print(",");
                }
            }
            escrever.println();
		}
		escrever.close();	
		
	}
}

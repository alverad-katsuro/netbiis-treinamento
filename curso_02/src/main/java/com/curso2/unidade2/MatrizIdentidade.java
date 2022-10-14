package com.curso2.unidade2;

public class MatrizIdentidade {
    private static final int TAMANHO_MATRIX = 3;

	
    /** 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
		int identidade[][] = new int[TAMANHO_MATRIX][TAMANHO_MATRIX];
		
		for(int i = 0; i < TAMANHO_MATRIX; i++){
			for(int j = 0; j < TAMANHO_MATRIX; j++) {
				if (i == j){
                    identidade[i][j] = 1;
                } else {
                    identidade[i][j] = 0;
                }
			}
        }
        String matriz = "";
        for(int i = 0; i < TAMANHO_MATRIX; i++){
			for(int j = 0; j < TAMANHO_MATRIX; j++) {
				matriz += identidade[i][j] + " ";
			}
            matriz+="\n";
        }

        System.out.print(matriz);
					
	}
}

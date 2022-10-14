package com.curso1.unidade_four;


import javax.swing.JOptionPane;

public class MostraTabuada {

	
    /** 
     * @param args
     */
    public static void main(String[] args) {
		
		int numero;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um numero"));
		tabuada(numero);
	}

    
    /** 
     * @param numero
     */
    public static void tabuada(int numero){
		String resposta = "";
        int total = 1;
        for(int i=0; i <= 10 ;i++)
		{
			total = numero * i;
            resposta += numero+" x "+i+" = " + total + "\n";
		}
        JOptionPane.showMessageDialog(null, resposta);
    }
}

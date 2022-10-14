package com.curso1.unidade_five;

import java.io.FileWriter;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

import com.curso1.unidade_four.Repetir;

public class Arquivo {

	
    /** 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception  {
		FileWriter arquivo = new FileWriter("contatos.csv");
		PrintWriter escrever = new PrintWriter(arquivo);
		Repetir repetir = Repetir.CANCELAR;
		escrever.println("Nomes,Telefones,Cidades");
    
        do {
		    escrever.print(JOptionPane.showInputDialog(null, "Nome: ")+ ",");
		    escrever.print(JOptionPane.showInputDialog(null, "Telefone: ")+ ",");
		    escrever.println(JOptionPane.showInputDialog(null, "Cidade: "));
            repetir = (Repetir) JOptionPane.showInputDialog(null, "Novo contribuente?", "Novo Contribuente?", JOptionPane.QUESTION_MESSAGE, null, Repetir.values(), Repetir.REPETIR);
        } while (repetir == Repetir.REPETIR);
		escrever.close();
		arquivo.close();
	}
}

package com.curso1.unidade_three;

import javax.swing.JOptionPane;

import com.curso1.unidade_two.Sexo;

public class PesoIdeal {

	
    /** 
     * @param args
     */
    public static void main(String[] args) {
	     
		double altura, peso_ideal_homem, peso_ideal_mulher;

	    altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura"));
	    Sexo sexo = (Sexo) JOptionPane.showInputDialog(null, "Escolha o sexo da pessoa", "Escolha o Sexo", JOptionPane.QUESTION_MESSAGE, null, Sexo.values(), Sexo.MASCULINO);
		
        switch (sexo) {
            case MASCULINO:
                peso_ideal_homem = (altura*72.7) - 58;
                JOptionPane.showMessageDialog(null, "O peso ideal do homem é de " + peso_ideal_homem);
                break;
            default:
                peso_ideal_mulher = (altura*62.1) - 44.7;
                JOptionPane.showMessageDialog(null, "O peso ideal da mulher é de " + peso_ideal_mulher);
                break;
        }
	}

}

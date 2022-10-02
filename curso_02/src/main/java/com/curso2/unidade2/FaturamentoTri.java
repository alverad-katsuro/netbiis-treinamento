package com.curso2.unidade2;

import javax.swing.JOptionPane;

public class FaturamentoTri {
    public static void main(String[] args) {
        parte_2();
    }

    public static void parte_1() {
        float janeiro = 15_000f;
        float fevereiro = 23_000f;
        float marco = 17_000f;
        JOptionPane.showMessageDialog(null, "O faturamento foi R$"+(janeiro+fevereiro+marco));
    }

    public static void parte_2(){
        float faturamento = 0;
        String resposta;
        do {
            resposta = (JOptionPane.showInputDialog(null, "Digite um valor"));
            if (resposta != null && resposta.length() > 0){
                faturamento += Float.parseFloat(resposta);
            }
        } while(resposta != null);
        JOptionPane.showMessageDialog(null, "O faturamento foi R$"+faturamento);
    }
}

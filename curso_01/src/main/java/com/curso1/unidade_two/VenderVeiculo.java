package com.curso1.unidade_two;

import javax.swing.JOptionPane;

public class VenderVeiculo {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        String veiculo = JOptionPane.showInputDialog(null, "Digite o modelo do veículo:");
        float veiculo_preco = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o preço do veículo:"));
        JOptionPane.showMessageDialog(null, "Deve ser dado de entrada no " + veiculo + " o valor de R$ " + veiculo_preco * 0.5 + " e as parcelas ficam com o seguinte preço: 12x de R$ " + veiculo_preco * 0.5 / 12.0);
    }
}

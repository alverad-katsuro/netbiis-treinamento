package com.curso2.unidade3;

import javax.swing.JOptionPane;

public class Substring {
    public static void main(String[] args) {
        String palavra1 = "Oi gente";
        String palavra2 = "Até mais!!!";
        JOptionPane.showMessageDialog(null,  String.format("%s %s", palavra1, palavra2));
        JOptionPane.showMessageDialog(null,  String.format("%s", palavra1.substring(2, 7)));
    }
}

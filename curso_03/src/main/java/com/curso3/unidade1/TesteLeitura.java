package com.curso3.unidade1;

import java.io.IOException;

public class TesteLeitura {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        byte [] bytes = new byte[10];
        System.out.print("Digite algo: ");
        try {
            System.in.read(bytes);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("\nEco: " + new String(bytes));
    }
}

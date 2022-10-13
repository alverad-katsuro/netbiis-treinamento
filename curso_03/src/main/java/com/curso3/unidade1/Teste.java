package com.curso3.unidade1;
/**
* Classe
* @author Alfredo Gabriel
*/
public class Teste {
    /**
     * @param args
     * @throws IndexOutOfBoundsException
     */
    public static void main (String args[]) throws IndexOutOfBoundsException {
        int i=0;
        String frases[] = {"um","dois","três"};
        try {
            while (i<4) { // o índice vai de 0 a 2 !
                System.out.println(frases[i]);
                i++;
            }            
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}

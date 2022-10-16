package com.curso3.unidade1;

public class TesteExcecao {

    
    /** 
     * @param a
     * @param b
     * @throws ArithmeticException
     */
    public static void dividir(int a, int b) throws ArithmeticException {
        try {
            System.out.println("O resultado " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Erro triste");
            e.printStackTrace();
        }
    }
    
    /** 
     * @throws NullPointerException
     */
    @SuppressWarnings({"null"})
    public static void imp() throws NullPointerException {
        try {
            Object c = null;
            System.out.println("O resultado " + c.toString());
        } catch (NullPointerException e) {
            System.out.println("Erro triste");
            e.printStackTrace();
        }
    }

    
    /** 
     * @param args[]
     */
    public static void main(String args[]) {
        dividir(50, 0);
        imp();
    } 
}

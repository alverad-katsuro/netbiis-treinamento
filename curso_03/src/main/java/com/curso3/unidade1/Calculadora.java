package com.curso3.unidade1;

import com.curso3.unidade1.exceptions.DivisaoZeroException;

public class Calculadora {

    /**
     * @param args
     */
    public static void main(String[] args) {
        try {
            divisao(10, 0);
        } catch (DivisaoZeroException e) {
            e.printStackTrace();
        }
    }

    /**
     * @param a
     * @param b
     * @throws DivisaoZeroException
     */
    public static void divisao(float a, float b) throws DivisaoZeroException {
        if (a == 0 || b == 0) {
            throw new DivisaoZeroException("Divisão com Zero");
        } else {
            System.out.println(a / b);
        }
    }
}

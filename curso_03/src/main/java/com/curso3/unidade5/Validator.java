package com.curso3.unidade5;

@FunctionalInterface
public interface Validator<T> {
    boolean validar(T t);
    /* Interface Funcional so aceita um método.
    boolean outroMetodo(T t);
    */

    public static void main(String[] args) {
        Validator<String> validarCPF = (t) -> {return t.matches("[0-9]{5}-[0-9]{3}");};

        System.out.println(validarCPF.validar("68447-000"));
    }
}

package com.curso3.unidade2;

@Copyright(autor = "Alfredo Gabriel", data = "15/10/2022", versao = "1.0")

public class InternetApp implements Internet {

    public static void main(String[] args) {
        System.out.println("aaaaaaaa");
    }
    
    @SuppressWarnings("deprecated")
    @Override
    public void conectar() {
        System.out.println("Conectar");
    }
    
    @Override
    public void conectarSSL() {
        System.out.println("ConectarSSL");
    }
    
}

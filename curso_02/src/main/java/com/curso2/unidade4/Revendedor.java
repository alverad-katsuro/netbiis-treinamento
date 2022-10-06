package com.curso2.unidade4;

public enum Revendedor {
    RRCAR("000000/0000", "Alguma Rua, 1500", "Chevrolet"),
    BMW("010000/0000", "Alguma Rua, 1600", "BMW"),
    ABC("110000/0000", "Alguma Rua, 1200", "Fiat");

    public String cpnj;
    public String endereco;
    public String fabricante;

    private Revendedor(String cpnj, String endereco, String fabricante) {
        this.cpnj = cpnj;
        this.endereco = endereco;
        this.fabricante = fabricante;
    }   
}

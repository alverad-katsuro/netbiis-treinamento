package com.curso3.unidade4;

public record Cliente3(String cpf, String nome, String email) implements Comparable<Cliente3> {

    @Override
    public int compareTo(Cliente3 cliente){
        if (this.nome() == null || cliente.nome() == null) {
            return 0;
        }
        return nome().compareTo(cliente.nome());
    }
    
}

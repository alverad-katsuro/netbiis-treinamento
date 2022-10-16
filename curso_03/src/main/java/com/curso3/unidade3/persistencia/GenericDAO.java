package com.curso3.unidade3.persistencia;

public class GenericDAO<T> implements IDAO<T> {

    @Override
    public void create(T obj) {
        System.out.println("Criado");
    }
    
    @Override
    public void read(T obj) {
        System.out.println("Lido");        
    }
    
    @Override
    public void update(T obj) {
        System.out.println("Atualizado");        
    }
    
    @Override
    public void delete(T obj) {
        System.out.println("Deletado");
    }
    
}

package com.curso3.desafio.persistencia;

public interface IDAO<T> {
    public void create(T obj);
    public void read(T obj);
    public void update(T obj);
    public void delete(T obj);
}

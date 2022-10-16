package com.curso3.unidade3.persistencia;

public interface IDAO<T> {
    public void create(T obj);
    public void read(T obj);
    public void update(T obj);
    public void delete(T obj);
}

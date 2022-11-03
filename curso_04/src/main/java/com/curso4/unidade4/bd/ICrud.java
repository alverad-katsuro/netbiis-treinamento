package com.curso4.unidade4.bd;

import java.sql.SQLException;
import java.util.List;

public interface ICrud<T> {

    public boolean create(T obj) throws SQLException;
    public List<T> read() throws SQLException;
    public boolean update(T obj) throws SQLException;
    public boolean delete(T obj) throws SQLException;
    
}

package com.curso4.unidade4.bd;

import java.sql.SQLException;
import java.time.LocalDateTime;

import com.curso4.unidade4.model.Cliente;
import com.curso4.unidade4.model.Cliente_has_Curso;
import com.curso4.unidade4.model.Curso;

public class VendaApp {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(1,"Alfredo", "Gabriel", "amgabriel1@hotmail.com", "(91) 984487808", "000.000.000-00");
        ClienteDAO clientedao = new ClienteDAO();
        try {
            clientedao.create(cliente);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        
        Curso curso = new Curso(1, "curso1", "Descricao", 150f, "url");
        CursoDAO cursodao = new CursoDAO();
        try {
            cursodao.create(curso);
        } catch (SQLException e) {
            e.printStackTrace();
        }


        VendaDAO vendadao = new VendaDAO();
        Cliente_has_Curso venda = new Cliente_has_Curso(cliente.getClienteId(), curso.getId(), LocalDateTime.now());
        try {
            vendadao.create(venda);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

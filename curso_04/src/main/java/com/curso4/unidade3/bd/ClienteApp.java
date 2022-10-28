package com.curso4.unidade3.bd;

import java.sql.SQLException;

import com.curso4.unidade3.model.Cliente;

public class ClienteApp {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Alfredo", "Gabriel", "amgabriel1@hotmail.com", "(91) 984487808", "000.000.000-00");
        ClienteDAO clientedao = new ClienteDAO();
        try {
            //clientedao.create(cliente);
            clientedao.inserirSP(cliente);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

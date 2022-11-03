package com.curso4.unidade4.bd;

import java.sql.SQLException;
import java.util.List;

import com.curso4.unidade4.model.Cliente;

public class ClienteApp {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Alfredo", "Gabriel", "amgabriel1@hotmail.com", "(91) 984487808", "000.000.000-00");
        Cliente cliente2 = new Cliente("Alfredo2", "Gabriel", "amgabriel1@hotmail.com", "(91) 984487808", "000.000.000-00");
        ClienteDAO clientedao = new ClienteDAO();
        cliente.setClienteId(0);
        try {
            clientedao.create(cliente);
            clientedao.inserirSP(cliente2);
            List<Cliente> clientes = clientedao.read();
            // Remove cliente 1
            clientedao.delete(clientes.get(0));
            System.out.println(clientedao.read());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

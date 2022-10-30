package com.curso4.unidade3;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.curso4.unidade3.bd.ClienteDAO;
import com.curso4.unidade3.bd.CursoDAO;
import com.curso4.unidade3.bd.VendaDAO;
import com.curso4.unidade3.model.Cliente;
import com.curso4.unidade3.model.Curso;
import com.curso4.unidade3.model.Venda;

public class LojaVirtual {
    public List<Cliente> clientes;
    public List<Curso> cursos;
    public List<Venda> vendas;
    public VendaDAO vendadao = new VendaDAO();
    public ClienteDAO clientedao = new ClienteDAO();
    public CursoDAO cursodao = new CursoDAO();
    
    public static void main(String[] args) {
        LojaVirtual lojaVirtual = new LojaVirtual();

        Cliente cliente = new Cliente("nome", "sobrenome", "email", "telefone", "cpf");
        
        lojaVirtual.clientes = new ArrayList<>();
        lojaVirtual.clientes.add(cliente);
        cliente.setNome("Mudei nome");
        lojaVirtual.clientes.forEach(System.out::println);
    }

    public void cadastrarCliente(Cliente cliente) throws SQLException {
        clientedao.create(cliente);
        clientes.add(cliente);
    }

    public void deletarCliente(Cliente cliente) throws SQLException {
        clientedao.delete(cliente);
        clientes.remove(cliente);
    }

    public void atualizarCliente(Cliente cliente) throws SQLException {
        clientedao.update(cliente);
    }

    public void recuperarCliente(Cliente cliente) throws SQLException{
        clientes = clientedao.read();
    }

    public void cadastrarCurso(Curso curso) throws SQLException {
        cursodao.create(curso);
        cursos.add(curso);
    }

    public void deletarCurso(Curso curso) throws SQLException {
        cursodao.delete(curso);
        cursos.remove(curso);
    }

    public void atualizarCurso(Curso curso) throws SQLException {
        cursodao.update(curso);
    }

    public void recuperarCurso(Curso curso) throws SQLException{
        cursos = cursodao.read();
    }

    public void cadastrarVenda(Venda venda) throws SQLException {
        vendadao.create(venda);
        vendas.add(venda);
    }

    public void deletarVenda(Venda venda) throws SQLException {
        vendadao.delete(venda);
        vendas.remove(venda);
    }

    public void atualizarVenda(Venda venda) throws SQLException {
        vendadao.update(venda);
    }

    public void recuperarVenda(Venda venda) throws SQLException{
        vendas = vendadao.read();
    }
    
}

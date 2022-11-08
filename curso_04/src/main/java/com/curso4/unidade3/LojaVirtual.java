package com.curso4.unidade3;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.curso4.unidade3.bd.ClienteDAO;
import com.curso4.unidade3.bd.CursoDAO;
import com.curso4.unidade3.bd.PagamentoDAO;
import com.curso4.unidade3.model.Cliente;
import com.curso4.unidade3.model.Curso;
import com.curso4.unidade3.model.Pagamento;

public class LojaVirtual {
    public List<Cliente> clientes = new ArrayList<>();;
    public List<Curso> cursos;
    public List<Pagamento> pagamentos;
    public PagamentoDAO pagamentodao = new PagamentoDAO();
    public ClienteDAO clientedao = new ClienteDAO();
    public CursoDAO cursodao = new CursoDAO();

    public static void main(String[] args) throws SQLException {
        LojaVirtual lojaVirtual = new LojaVirtual();

        Cliente cliente = new Cliente("nome", "sobrenome", "email", "telefone", "cpf");

        lojaVirtual.cadastrarCliente(cliente);
        cliente.setNome("Mudei nome");

        lojaVirtual.atualizarCliente(cliente);

        lojaVirtual.recuperarCliente();
        
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

    public void recuperarCliente() throws SQLException {
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

    public void recuperarCurso() throws SQLException {
        cursos = cursodao.read();
    }

    public void cadastrarPagamento(Pagamento pagamento) throws SQLException {
        pagamentodao.create(pagamento);
        pagamentos.add(pagamento);
    }

    public void deletarPagamento(Pagamento pagamento) throws SQLException {
        pagamentodao.delete(pagamento);
        pagamentos.remove(pagamento);
    }

    public void atualizarPagamento(Pagamento pagamento) throws SQLException {
        pagamentodao.update(pagamento);
    }

    public void recuperarPagamento() throws SQLException {
        pagamentos = pagamentodao.read();
    }

}

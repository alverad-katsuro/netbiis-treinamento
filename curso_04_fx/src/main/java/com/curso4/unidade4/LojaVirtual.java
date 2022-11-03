package com.curso4.unidade4;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.curso4.unidade4.bd.ClienteDAO;
import com.curso4.unidade4.bd.ClienteHasCursoDAO;
import com.curso4.unidade4.bd.CursoDAO;
import com.curso4.unidade4.model.Cliente;
import com.curso4.unidade4.model.ClienteHasCurso;
import com.curso4.unidade4.model.ClienteHasCursoId;
import com.curso4.unidade4.model.Curso;

public class LojaVirtual {
    private List<Cliente> clientes = new ArrayList<>();
    private List<Curso> cursos = new ArrayList<>();
    private List<ClienteHasCurso> vendas = new ArrayList<>();
    private ClienteDAO clienteDAO = new ClienteDAO();
    private CursoDAO cursoDAO = new CursoDAO();
    private ClienteHasCursoDAO clienteHasCursoDAO = new ClienteHasCursoDAO();
    
    public static void main(String[] args) {
        LojaVirtual lj = new LojaVirtual();
        System.out.println(lj.recuperarCliente());
    }

    public void cadastrarCliente(Cliente cliente) {
        clienteDAO.persist(cliente);
    }

    public void deletarCliente(Cliente cliente) {
        clienteDAO.delete(cliente);
        clientes.remove(cliente);
    }

    public void atualizarCliente(Cliente cliente) {
        clienteDAO.merge(cliente);
    }

    public List<Cliente> recuperarCliente(){
        return clienteDAO.findAll();
    }

    public Cliente recuperarCliente(int clientID){
        return clienteDAO.findById(clientID);
    }

    public void cadastrarCurso(Curso curso) {
        cursoDAO.persist(curso);
        cursos.add(curso);
    }

    public void deletarCurso(Curso curso) {
        cursoDAO.delete(curso);
        cursos.remove(curso);
    }

    public void atualizarCurso(Curso curso) {
        cursoDAO.merge(curso);
    }

    public List<Curso> recuperarCurso(){
        return cursoDAO.findAll();
    }

    public Curso recuperarCurso(int cursoID){
        return cursoDAO.findById(cursoID);
    }

    public void cadastrarVenda(ClienteHasCurso venda) {
        clienteHasCursoDAO.persist(venda);
        vendas.add(venda);
    }

    public void deletarVenda(ClienteHasCurso venda) {
        clienteHasCursoDAO.delete(venda);
        vendas.remove(venda);
    }

    public void atualizarVenda(ClienteHasCurso venda) {
        clienteHasCursoDAO.merge(venda);
    }

    public List<ClienteHasCurso> recuperarVenda(){
        return clienteHasCursoDAO.findAll();
    }

    public ClienteHasCurso recuperarVenda(int cliente_id, int curso_id){
        return clienteHasCursoDAO.findById(new ClienteHasCursoId(cliente_id, curso_id));
    }

    public void cadastrarVenda(Cliente cliente, Curso curso){
        ClienteHasCursoId chc_id = new ClienteHasCursoId(cliente.getClienteId(), curso.getCursoId());
        ClienteHasCurso venda = new ClienteHasCurso(chc_id, cliente, curso, Date.valueOf(LocalDate.now().toString()));
        cadastrarVenda(venda);
    }
    
}

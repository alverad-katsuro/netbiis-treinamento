package com.curso4.unidade4;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

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
        while (true) {
            Tabelas tabelas = (Tabelas)JOptionPane.showInputDialog(null, "Selecione uma tabela para realizar alguma operação", "Escolha", JOptionPane.PLAIN_MESSAGE, null, Tabelas.values(), Tabelas.CLIENTE);
            switch (tabelas) {
                case CLIENTE -> {
                    OpcoesCRUD opcoesCRUD = (OpcoesCRUD)JOptionPane.showInputDialog(null, "Selecione uma das operações", "Escolha", 0, null, OpcoesCRUD.values(), OpcoesCRUD.CADASTRAR);
                    switch (opcoesCRUD) {
                        case CADASTRAR -> {
                            Cliente cliente = new Cliente();
                            cliente.setClienteNome(JOptionPane.showInputDialog(null, "Digite o nome do cliente"));
                            cliente.setClienteSobrenome(JOptionPane.showInputDialog(null, "Digite o sobrenome do cliente"));
                            cliente.setClienteEmail(JOptionPane.showInputDialog(null, "Digite o email do cliente"));
                            cliente.setClienteTelefone(JOptionPane.showInputDialog(null, "Digite o Telefone do cliente"));
                            cliente.setClienteCpf(JOptionPane.showInputDialog(null, "Digite o cpf do cliente"));
                        }
                        case DELETAR -> {
                            int cliente_id = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a ID do cliente"));
                            lj.deletarCliente(lj.clienteDAO.findById(cliente_id));
                            JOptionPane.showMessageDialog(null, "Cliente deletado");
                        }
                        case ATUALIZAR -> {
                            Cliente cliente = new Cliente();
                            cliente.setClienteId(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a ID do cliente")));
                            cliente.setClienteNome(JOptionPane.showInputDialog(null, "Digite o nome do cliente"));
                            cliente.setClienteSobrenome(JOptionPane.showInputDialog(null, "Digite o sobrenome do cliente"));
                            cliente.setClienteEmail(JOptionPane.showInputDialog(null, "Digite o email do cliente"));
                            cliente.setClienteTelefone(JOptionPane.showInputDialog(null, "Digite o Telefone do cliente"));
                            cliente.setClienteCpf(JOptionPane.showInputDialog(null, "Digite o cpf do cliente"));
                            lj.atualizarCliente(cliente);
                            JOptionPane.showMessageDialog(null, "Cliente atualizado");
                        }
                        case PROCURAR -> {
                            int cliente_id = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a ID do cliente"));
                            Cliente cliente = lj.clienteDAO.findById(cliente_id);
                            JOptionPane.showMessageDialog(null, cliente);
                        }
                    }
                }
                case CURSO -> {
                    OpcoesCRUD opcoesCRUD = (OpcoesCRUD)JOptionPane.showInputDialog(null, "Selecione uma das operações", "Escolha", 0, null, OpcoesCRUD.values(), OpcoesCRUD.CADASTRAR);
                    switch (opcoesCRUD) {
                        case CADASTRAR -> {
                            Curso curso = new Curso();
                            curso.setCursoNome(JOptionPane.showInputDialog(null, "Digite o nome do curso"));
                            curso.setCursoUrl(JOptionPane.showInputDialog(null, "Digite a URL do curso"));
                            curso.setCursoValor(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do curso")));
                            lj.cadastrarCurso(curso);
                        }
                        case DELETAR -> {
                            int curso_id = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a ID do curso"));
                            lj.deletarCurso(lj.cursoDAO.findById(curso_id));
                            JOptionPane.showMessageDialog(null, "Cliente deletado");
                        }
                        case ATUALIZAR -> {
                            Curso curso = new Curso();
                            curso.setCursoId(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a ID do curso")));
                            curso.setCursoNome(JOptionPane.showInputDialog(null, "Digite o nome do curso"));
                            curso.setCursoUrl(JOptionPane.showInputDialog(null, "Digite a URL do curso"));
                            curso.setCursoValor(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do curso")));
                            lj.atualizarCurso(curso);
                        }
                        case PROCURAR -> {
                            int curso_id = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a ID do curso"));
                            Curso curso = lj.cursoDAO.findById(curso_id);
                            JOptionPane.showMessageDialog(null, curso);
                        }
                    }
                }
                case VENDA -> {
                    OpcoesCRUD opcoesCRUD = (OpcoesCRUD)JOptionPane.showInputDialog(null, "Selecione uma das operações", "Escolha", 0, null, OpcoesCRUD.values(), OpcoesCRUD.CADASTRAR);
                    switch (opcoesCRUD) {
                        case CADASTRAR -> {
                            int cliente_id = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a ID do cliente"));
                            int curso_id = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a ID do curso"));
                            Cliente cli = lj.clienteDAO.findById(cliente_id);
                            Curso curso = lj.cursoDAO.findById(curso_id);
                            lj.cadastrarVenda(cli, curso);
                        }
                        case DELETAR -> {
                            JOptionPane.showMessageDialog(null, "Você não pode fazer isso");
                        }
                        case ATUALIZAR -> {
                            JOptionPane.showMessageDialog(null, "Você não pode fazer isso");
                        }
                        case PROCURAR -> {
                            int cliente_id = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a ID do cliente"));
                            int curso_id = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a ID do curso"));
                            ClienteHasCurso clienteCurso = lj.clienteHasCursoDAO.findById(new ClienteHasCursoId(cliente_id, curso_id));
                            JOptionPane.showMessageDialog(null, clienteCurso);
                        }
                    }
                }
            }
        }
        
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

package com.lojavirtual;

import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

import com.lojavirtual.dao.ClienteDAO;
import com.lojavirtual.dao.CursoDAO;
import com.lojavirtual.dao.VendaDAO;
import com.lojavirtual.model.Cliente;
import com.lojavirtual.model.ClienteHasCurso;
import com.lojavirtual.model.ClienteHasCursoId;
import com.lojavirtual.model.Curso;

//import net.miginfocom.swing.MigLayout;

/*
 * Está e classe principal que sera chamada para iniciar a aplicação
 */
public class LojaVirtual {
    private static EntityManagerFactory entityManagerFactory = Persistence.
    createEntityManagerFactory("curso_04");

    
	/** 
     * @return EntityManagerFactory
     */
    public static EntityManagerFactory getEntityManagerFactory() {
        return entityManagerFactory;
    }


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
                            lj.deletarCliente(ClienteDAO.findCliente_byID(cliente_id));
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
                            Cliente cliente = ClienteDAO.findCliente_byID(cliente_id);
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
                            curso.setCursoDescricao(JOptionPane.showInputDialog(null, "Digite a descrição do curso"));
                            curso.setCursoValor(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do curso")));
                            lj.cadastrarCurso(curso);
                        }
                        case DELETAR -> {
                            int curso_id = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a ID do curso"));
                            lj.deletarCurso(CursoDAO.findCurso_byID(curso_id));
                            JOptionPane.showMessageDialog(null, "Cliente deletado");
                        }
                        case ATUALIZAR -> {
                            Curso curso = new Curso();
                            curso.setCursoId(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a ID do curso")));
                            curso.setCursoNome(JOptionPane.showInputDialog(null, "Digite o nome do curso"));
                            curso.setCursoValor(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do curso")));
                            lj.atualizarCurso(curso);
                        }
                        case PROCURAR -> {
                            int curso_id = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a ID do curso"));
                            Curso curso = CursoDAO.findCurso_byID(curso_id);
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
                            Cliente cli = ClienteDAO.findCliente_byID(cliente_id);
                            Curso curso = CursoDAO.findCurso_byID(curso_id);
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
                            ClienteHasCurso clienteCurso = VendaDAO.findClienteHasCurso_byID(new ClienteHasCursoId(cliente_id, curso_id));
                            JOptionPane.showMessageDialog(null, clienteCurso);
                        }
                    }
                }
            }
        }
        
    }

    public void cadastrarCliente(Cliente cliente) {
        ClienteDAO.createCliente(cliente);
    }

    public void deletarCliente(Cliente cliente) {
        ClienteDAO.deleteCliente(0);
    }

    public void atualizarCliente(Cliente cliente) {
        ClienteDAO.updateCliente(cliente);
    }

    public List<Cliente> recuperarCliente(){
        return ClienteDAO.readClientes();
    }

    public Cliente recuperarCliente(int clientID){
        return ClienteDAO.findCliente_byID(clientID);
    }

    public void cadastrarCurso(Curso curso) {
        CursoDAO.createCurso(curso);
    }

    public void deletarCurso(Curso curso) {
        CursoDAO.deleteCurso(0);
    }

    public void atualizarCurso(Curso curso) {
        CursoDAO.updateCurso(curso);
    }

    public List<Curso> recuperarCurso(){
        return CursoDAO.readCursos();
    }

    public Curso recuperarCurso(int cursoID){
        return CursoDAO.findCurso_byID(cursoID);
    }

    public void cadastrarVenda(ClienteHasCurso venda) {
        VendaDAO.createClienteHasCurso(venda);
    }

    public void deletarVenda(int venda_id) {
        VendaDAO.deleteClienteHasCurso(venda_id);
    }

    public void atualizarVenda(ClienteHasCurso venda) {
        VendaDAO.updateClienteHasCurso(venda);
    }

    public List<ClienteHasCurso> recuperarVenda(){
        return VendaDAO.readClienteHasCursos();
    }

    public ClienteHasCurso recuperarVenda(int cliente_id, int curso_id){
        return VendaDAO.findClienteHasCurso_byID(new ClienteHasCursoId(cliente_id, curso_id));
    }

    public void cadastrarVenda(Cliente cliente, Curso curso){
        ClienteHasCursoId chc_id = new ClienteHasCursoId(cliente.getClienteId(), curso.getCursoId());
        ClienteHasCurso venda = new ClienteHasCurso(chc_id);
        cadastrarVenda(venda);
    }
}
package com.curso4.unidade4.bd;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.curso4.unidade4.model.Cliente;

public final class ClienteDAO extends ConfiguracaoBD implements ICrud<Cliente> {

    public void inserirSP(Cliente cliente) throws SQLException{
        conectar();
        String comando_sql = "CALL lojavirtual.SP_INSERIR_CLIENTE(?, ?, ?, ?, ?)";
        CallableStatement cst = conexao.prepareCall(comando_sql);
        cst.setString(1, cliente.getClienteNome());
        cst.setString(2, cliente.getClienteSobrenome());
        cst.setString(3, cliente.getClienteCpf());
        cst.setString(4, cliente.getClienteEmail());
        cst.setString(5, cliente.getClienteTelefone());
        cst.execute();
        conexao.commit();
        desconectar();
    }
    
    @Override
    public boolean create(Cliente cliente) throws SQLException {
        conectar();
        String comando_sql = "insert into Cliente (cliente_nome, cliente_sobrenome, cliente_email, cliente_telefone, cliente_cpf) values (?,?,?,?,?)";
        try {
            PreparedStatement pst = conexao.prepareStatement(comando_sql);
            pst.setString(1, cliente.getClienteNome());
            pst.setString(2, cliente.getClienteSobrenome());
            pst.setString(3, cliente.getClienteEmail());
            pst.setString(4, cliente.getClienteTelefone());
            pst.setString(5, cliente.getClienteCpf());
            pst.execute();
            conexao.commit();
            desconectar();
            return true;
        }catch(Exception e){
            desconectar();
            System.out.println(e);
            return false;
        }
    }

    @Override
    public boolean delete(Cliente cliente) throws SQLException {
        conectar();
        String comando_sql = "DELETE FROM Cliente where cliente_id=?";
        try {
            PreparedStatement pst = conexao.prepareStatement(comando_sql);
            pst.setInt(1, cliente.getClienteId());
            pst.executeUpdate();
            conexao.commit();
            desconectar();
            return true;
        }catch(Exception e){
            desconectar();
            System.out.println(e);
            return false;
        }
    }

    @Override
    public List<Cliente> read() throws SQLException {
        conectar();
        String comando_sql = "select * from Cliente";
        List<Cliente> clientes = new ArrayList<>();
        PreparedStatement pst = conexao.prepareStatement(comando_sql);
        ResultSet rs = pst.executeQuery();
        try {
            while (rs.next()){
                int idcliente = Integer.parseInt(rs.getString(1));
                String nome= rs.getString(2);
                String sobrenome= rs.getString(3);
                String email = rs.getString(4);
                String telefone = rs.getString(5);
                String cpf = rs.getString(6);
                clientes.add(new Cliente(idcliente, nome, sobrenome, email, telefone, cpf));
            }
            desconectar();
            return clientes;
        } catch (SQLException e) {
            desconectar();
            System.out.println(e);
            return null;
        }
    }

    @Override
    public boolean update(Cliente cliente) throws SQLException {
        conectar();
        String comando_sql = "update Cliente set cliente_nome=?, cliente_sobrenome=?, cliente_email=?, cliente_telefone=?, cliente_cpf=? where cliente_id=?";
        try {
            PreparedStatement pst = conexao.prepareStatement(comando_sql);
            pst.setString(1, cliente.getClienteNome());
            pst.setString(2, cliente.getClienteSobrenome());
            pst.setString(3, cliente.getClienteEmail());
            pst.setString(4, cliente.getClienteTelefone());
            pst.setString(5, cliente.getClienteCpf());
            pst.setString(6, String.valueOf(cliente.getClienteId()));
            pst.executeUpdate();
            conexao.commit();
            desconectar();
            return true;
        } catch (Exception e) {
            desconectar();
            System.out.println(e);
            return false;
        }
        
    }

}

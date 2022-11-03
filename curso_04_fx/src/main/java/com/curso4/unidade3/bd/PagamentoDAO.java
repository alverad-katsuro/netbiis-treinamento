package com.curso4.unidade3.bd;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.curso4.unidade3.model.Pagamento;

public final class PagamentoDAO extends ConfiguracaoBD implements ICrud<Pagamento> {

    @Override
    public boolean create(Pagamento venda) throws SQLException {
        conectar();
        String comando_sql = "insert into cliente_has_curso (cliente_id, curso_id, venda_data) values (?,?,?)";
        try {
            PreparedStatement pst = conexao.prepareStatement(comando_sql);
            pst.setInt(1, venda.cliente_id());
            pst.setInt(2, venda.curso_id());
            pst.setTimestamp(3, Timestamp.valueOf(venda.dataCompra()));
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
    public List<Pagamento> read() throws SQLException {
        // select cliente_nome, curso_nome, venda_data from Cliente cli, Curso cur, cliente_has_curso chc where chc.cliente_id = cli.cliente_id && chc.curso_id = cur.curso_id;
        conectar();
        String comando_sql = "select * from cliente_has_curso";
        List<Pagamento> vendas = new ArrayList<>();
        PreparedStatement pst = conexao.prepareStatement(comando_sql);
        ResultSet rs = pst.executeQuery();
        try {
            while (rs.next()){
                int cliente_id = Integer.parseInt(rs.getString(1));
                int curso_id = Integer.parseInt(rs.getString(2));
                LocalDateTime data = rs.getTimestamp(3).toLocalDateTime();
                vendas.add(new Pagamento(cliente_id, curso_id, data));
            }
            desconectar();
            return vendas;
        } catch (SQLException e) {
            desconectar();
            System.out.println(e);
            return null;
        }
    }

    @Override
    public boolean update(Pagamento venda) throws SQLException {
        conectar();
        String comando_sql = "update cliente_has_curso set venda_data=? where cliente_id=? && curso_id=?";
        try {
            PreparedStatement pst = conexao.prepareStatement(comando_sql);
            pst.setTimestamp(1, Timestamp.valueOf(venda.dataCompra()));
            pst.setInt(2, venda.cliente_id());
            pst.setInt(3, venda.curso_id());
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

    @Override
    public boolean delete(Pagamento venda) throws SQLException {
        conectar();
        String comando_sql = "DELETE FROM cliente_has_curso where cliente_id=? && curso_id=?";
        try {
            PreparedStatement pst = conexao.prepareStatement(comando_sql);
            pst.setInt(1, venda.cliente_id());
            pst.setInt(2, venda.curso_id());
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
    
}

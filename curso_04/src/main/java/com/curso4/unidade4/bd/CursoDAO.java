package com.curso4.unidade4.bd;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.curso4.unidade4.model.Curso;

public final class CursoDAO extends ConfiguracaoBD implements ICrud<Curso> {

    public void inserirSP(Curso curso) throws SQLException{
        conectar(); 
        String comando_sql = "CALL lojavirtual.SP_INSERIR_CURSO(?, ?, ?, ?)";
        CallableStatement cst = conexao.prepareCall(comando_sql);
        cst.setString(1, curso.getNome());
        cst.setString(2, curso.getDescricao());
        cst.setFloat(3, curso.getValor());
        cst.setString(4, curso.getUrl());
        cst.execute();
        conexao.commit();
        desconectar();
    }
    
    @Override
    public boolean create(Curso curso) throws SQLException {
        conectar();
        String comando_sql = "insert into Curso (curso_nome, curso_descricao, curso_valor, curso_url) values (?,?,?,?)";
        try {
            PreparedStatement pst = conexao.prepareStatement(comando_sql);
            pst.setString(1, curso.getNome());
            pst.setString(2, curso.getDescricao());
            pst.setFloat(3, curso.getValor());
            pst.setString(4, curso.getUrl());
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
    public boolean delete(Curso curso) throws SQLException {
        conectar();
        String comando_sql = "DELETE FROM Curso where curso_id=?";
        try {
            PreparedStatement pst = conexao.prepareStatement(comando_sql);
            pst.setInt(1, curso.getId());
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
    public List<Curso> read() throws SQLException {
        conectar();
        String comando_sql = "select * from Curso";
        List<Curso> cursos = new ArrayList<>();
        PreparedStatement pst = conexao.prepareStatement(comando_sql);
        ResultSet rs = pst.executeQuery();
        try {
            while (rs.next()){
                int id = Integer.parseInt(rs.getString(1));
                String nome= rs.getString(2);
                String descricao= rs.getString(3);
                float valor = Float.parseFloat(rs.getString(4));
                String url = rs.getString(5);
                cursos.add(new Curso(id, nome, descricao, valor, url));
            }
            desconectar();
            return cursos;
        } catch (SQLException e) {
            desconectar();
            System.out.println(e);
            return null;
        }
    }

    @Override
    public boolean update(Curso curso) throws SQLException {
        conectar();
        String comando_sql = "update Curso set curso_nome=?, curso_descricao=?, curso_valor=?, curso_url=? where curso_id=?";
        try {
            PreparedStatement pst = conexao.prepareStatement(comando_sql);
            pst.setString(1, curso.getNome());
            pst.setString(2, curso.getDescricao());
            pst.setFloat(3, curso.getValor());
            pst.setString(4, curso.getUrl());
            pst.setString(5, String.valueOf(curso.getId()));
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

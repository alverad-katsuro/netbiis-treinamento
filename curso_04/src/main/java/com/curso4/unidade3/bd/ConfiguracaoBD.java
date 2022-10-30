package com.curso4.unidade3.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public sealed class ConfiguracaoBD permits ClienteDAO, CursoDAO, VendaDAO {

	static final String driver = "com.mysql.cj.jdbc.Driver";
	static final String user = "loja";
	static final String senha = "senhaloja";
	static final String url = "jdbc:mysql://localhost:3306/lojavirtual";
    static Connection conexao;
	
  
    public static void main(String[] args) throws SQLException {
        conectar();
        try {
            Statement statement = conexao.createStatement();
            String consulta = "select * from lojavirtual.Cliente";
            ResultSet rs = statement.executeQuery(consulta);
            while (rs.next()) {
                System.out.println(String.format("ID %d NOME %s SOBRENOME %s EMAIL %s TEL %s CPF %s", rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        desconectar();        
    }
 
	public static void conectar() throws SQLException {
		conexao = DriverManager.getConnection(url, user, senha);
        conexao.setAutoCommit(false);
	}

    public static void desconectar() throws SQLException{
        conexao.close();
    }
}

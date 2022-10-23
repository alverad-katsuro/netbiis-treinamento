package com.backend.bd;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConfiguracaoBD {
	private final String driver = "com.mysql.cj.jdbc.Driver";
	private final String user = "loja";
	private final String senha = "senhaloja";
	private final String url = "jdbc:mysql://localhost:3306/lojavirtual?useTimeZone=True&serverTimeZone=UTC";
	
/*

public static void main(String[] args) {
        ConfiguracaoBD bd = new ConfiguracaoBD();
        Connection con = bd.conectar();
        try {
            PreparedStatement pst = con.prepareStatement("select * from Cliente");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString(0));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        
    }
*/
	public Connection conectar() {
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, senha);
			return con;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
}

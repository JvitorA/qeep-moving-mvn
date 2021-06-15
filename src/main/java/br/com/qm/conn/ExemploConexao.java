package br.com.qm.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ExemploConexao {
	
	
	public static void main(String[] args) throws SQLException {
		
		Connection conn = DriverManager.getConnection(
                "jdbc:postgresql://127.0.0.1:5432/qeepmoving", "joao.alves", "");
		
		
		System.out.println("Conectado!");
		conn.close();
	}

}

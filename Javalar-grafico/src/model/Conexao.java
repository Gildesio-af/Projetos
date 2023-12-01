package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Conexao {
	
	private static String host = "da_java.mysql.dbaas.com.br";
	private static String usuario = "da_java";
	private static String senha  = "Tecnicas*2023@"; 
	private static String banco = "da_java";
	
	public Conexao() {
		this.host = "da_java.mysql.dbaas.com.br";
		this.usuario = "da_java";
		this.senha = "Tecnicas*2023@";
		this.banco = "da_java";
	}
	
	public static Connection getConnection() {
		String url = "jdbc:mysql://" + host + "/" + banco + "?verifyServerCertificate=false&useSSL=true";
		try {
			
			return DriverManager.getConnection(url, usuario, senha);
			
			
		} catch (SQLException e) {
			System.out.println("Connection failure!");
			e.printStackTrace();
			return null;
		}
	}
	
	public static void closeConnection(Connection con) {
		try {
			if(con != null) {
				con.close();
			}
			
		} catch (SQLException  e) {
			System.out.println("Falha no fechamento da conexao!");
		}
	}
	
	public static void closeConnection(Connection con, PreparedStatement st) {
		closeConnection(con);
		
		try {
			if(st != null) {
				st.close();
			}
			
			
		} catch (SQLException  e) {
			JOptionPane.showInternalMessageDialog(null, "Falha no fechamento da statment!");
		}
	}
	
	public static void closeConnection(Connection con, PreparedStatement st, ResultSet rs) {
		closeConnection(con, st);
		
		try {
			if(rs != null) {
				rs.close();
			}
			
		} catch (SQLException  e) {
			System.out.println("Falha no fechamento da statment!");
			JOptionPane.showInternalMessageDialog(null, "Não conectou na miser*");
		}
	}
	
}

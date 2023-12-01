package model;

import java.sql.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import javax.swing.JOptionPane;



import EspacoJaval.Mundo;
import Interacao.LeituraDados;
import data.DataBase;
import verificacao.Verificacoes;

public class RelatorioDao {
	
//	List<Mundo> mundos, Verificacoes verificacao, 
	
	public List<String[]> selectDados() {
		Connection conexao = Conexao.getConnection();
		String query = "Select * from javalar where id < 10000";
		PreparedStatement stmt = null;
		ResultSet rs = null;
		List<String[]> datasBase = new ArrayList<String[]>();
		try {
			
//			stmt = conexao.prepareStatement("SELECT * from javalar");
//			rs = stmt.executeQuery();
			rs = conexao.prepareStatement(query).executeQuery();
			while (rs.next()) {
				String[] arrayDados = new String[46];
				
				arrayDados[0] = rs.getString("nome");
		        arrayDados[1] = rs.getString("matricula"); //3
		        arrayDados[2] = rs.getString("nome_arquivo"); //4

		        for (int i = 5; i <= 47; i++) {
		        	arrayDados[i - 2] = String.valueOf(rs.getInt(i));
		        	
		        }
		        
		        datasBase.add(arrayDados);
		        
			}
			System.out.println("Numero" + datasBase.size());
			return datasBase;
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Dados não pegos!");
			e.printStackTrace();
			return null;
		}finally {
			Conexao.closeConnection(conexao, stmt, rs);
		}
		
	}
	
	
	public void createRelatorio(DataBase datas) {
		Connection conexao = Conexao.getConnection();
		PreparedStatement stmt = null;
		datas.imprimirDados();
		int parameterIndex = 1;
		try {
			stmt = conexao.prepareStatement("insert into javalar " +
                    "(nome, matricula, nome_arquivo, bug_python, bug_javascript, bug_ruby, bug_php, " +
                    "bug_csharp, bug_cmais, bug_c, dev_python, dev_javascript, dev_ruby, dev_php, " +
                    "dev_csharp, dev_cmais, dev_c, v_python, v_javascript, v_ruby, v_php, " +
                    "v_csharp, v_cmais, v_c, d_python, d_javascript, d_ruby, d_php, " +
                    "d_csharp, d_cmais, d_c, a_python, a_javascript, a_ruby, a_php, " +
                    "a_csharp, a_cmais, a_c, bug_q1, bug_q2, bug_q3, bug_q4, dev_q2, dev_q3, dev_q4 " +
                    ") " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?, ?, ?, ?, ?, ?, ?, ?, ?, ?, " +//20?
                    "?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?)");
			
//				stmt = conexao.prepareStatement("insert into javalar " +
//                    "(nome, matricula, nome_arquivo) values (?,?,?)");
			
			
			stmt.setString(1, datas.getNome());
			stmt.setString(2, datas.getMatricula());
			stmt.setString(3, datas.getNomeArquivo());
			stmt.setInt(4, datas.getbPython());
			stmt.setInt(5, datas.getbJS());
			stmt.setInt(6, datas.getbRuby());
			stmt.setInt(7, datas.getbPhp());
			stmt.setInt(8, datas.getbCSharp());
			stmt.setInt(9, datas.getbCPlusPlus());
			stmt.setInt(10, datas.getbC());
			stmt.setInt(11, datas.getdPython());
			stmt.setInt(12, datas.getdJS());
			stmt.setInt(13, datas.getdRuby());
			stmt.setInt(14, datas.getdPhp());
			stmt.setInt(15, datas.getdCSharp());
			stmt.setInt(16, datas.getdCPlusPlus());
			stmt.setInt(17, datas.getdC());
			stmt.setInt(18, datas.getvPython());
			stmt.setInt(19, datas.getvJS());
			stmt.setInt(20, datas.getvRuby());
			stmt.setInt(21, datas.getvPhp());
			stmt.setInt(22, datas.getvCSharp());
			stmt.setInt(23, datas.getvCPlusPlus());
			stmt.setInt(24, datas.getvC());
			stmt.setInt(25, datas.getDiasPython());
			stmt.setInt(26, datas.getDiasJS());
			stmt.setInt(27, datas.getDiasRuby());
			stmt.setInt(28, datas.getDiasPhp());
			stmt.setInt(29, datas.getDiasCSharp());
			stmt.setInt(30, datas.getDiasCPlusPlus());
			stmt.setInt(31, datas.getDiasC());
			stmt.setInt(32, datas.getaPython());
			stmt.setInt(33, datas.getaJS());
			stmt.setInt(34, datas.getaRuby());
			stmt.setInt(35, datas.getaPhp());
			stmt.setInt(36, datas.getaCSharp());
			stmt.setInt(37, datas.getaCPlusPlus());
			stmt.setInt(38, datas.getaC());
			stmt.setInt(39, datas.getB1());
			stmt.setInt(40, datas.getB2());
			stmt.setInt(41, datas.getB3());
			stmt.setInt(42, datas.getB4());
			

			stmt.setInt(43, datas.getD2());
			stmt.setInt(44, datas.getD3());
			
			stmt.setInt(45, datas.getD4());

			
//			for (Mundo mundo : mundos) {
//				stmt.setInt(parameterIndex, mundo.getnBugs());
//				parameterIndex++;
//			}
//			for (Mundo mundo : mundos) {
//				stmt.setInt(parameterIndex, mundo.getnDesenvolvedores());
//				parameterIndex++;
//			}
//			for (Mundo mundo : mundos) {
//				stmt.setInt(parameterIndex, (int)mundo.getvMedia());
//				parameterIndex++;
//			}
//			for (Mundo mundo : mundos) {
//				stmt.setInt(parameterIndex, (int)mundo.getDias());
//				parameterIndex++;
//			}
//			for (Mundo mundo : mundos) {
//				stmt.setInt(parameterIndex, (int)mundo.getAnos());
//				parameterIndex++;
//			}
//			
//			stmt.setInt(parameterIndex, verificacao.getB1());
//			parameterIndex++;
//			stmt.setInt(parameterIndex, verificacao.getB2());
//			parameterIndex++;
//			stmt.setInt(parameterIndex, verificacao.getB3());
//			parameterIndex++;
//			stmt.setInt(parameterIndex, verificacao.getB4());
//			parameterIndex++;
//			stmt.setInt(parameterIndex, verificacao.getD1());
//			parameterIndex++;
//			stmt.setInt(parameterIndex, verificacao.getD2());
//			parameterIndex++;
//			stmt.setInt(parameterIndex, verificacao.getD3());
//			parameterIndex++;
//			stmt.setInt(parameterIndex, verificacao.getD4());
//			
			stmt.executeUpdate();
			
//			
			
			
			
			JOptionPane.showInternalMessageDialog(null, "Foi");
			
			
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Dados falhou!");
			e.printStackTrace();
		}finally {
			Conexao.closeConnection(conexao, stmt);
		}
	}
	

	
}

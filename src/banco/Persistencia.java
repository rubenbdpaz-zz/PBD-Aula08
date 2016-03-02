package banco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Persistencia {
	
	private static Connection conn;
	
	//Manipulações do cliente
	private static void inserirCliente(Connection conexao) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "insert into cliente values (default,?,?)";
		PreparedStatement pstmt = conexao.prepareStatement(sql);
		
		//pstmt.setString(1, "");
		//pstmt.setString(2, "");
		
		pstmt.execute();
		conexao.commit();
		pstmt.close();
		System.out.println("Cliente inserido!");
	}
	
	private static void alterarCliente(Connection conexao) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "update cliente set nome = ? where cpf = ?";
		PreparedStatement pstmt = conexao.prepareStatement(sql);
		
//		pstmt.setString(1, "Maria Ana dos Anjos");
//		pstmt.setString(2, "111.111.111-11");
		
		pstmt.execute();
		conexao.commit();
		pstmt.close();
		System.out.println("Cliente alterado!");
	}

	private static void deletarCliente(Connection conexao) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "delete from cliente where nome = ? and cpf = ?";
		PreparedStatement pstmt = conexao.prepareStatement(sql);
		
//		pstmt.setString(1, "Maria Ana dos Anjos");
//		pstmt.setString(2, "111.111.111-11");
		
		pstmt.execute();
		conexao.commit();
		pstmt.close();
		System.out.println("Cliente excluido!");
	}
	
	private static void consultarCliente(Connection conexao) throws SQLException {
		// TODO Auto-generated method stub
		Statement stmt = conexao.createStatement();
		String sql = "select * from cliente";
		ResultSet rs = stmt.executeQuery(sql);
		
		while (rs.next()) {
			System.out.println("Id: " + rs.getInt("idcliente") + " " + rs.getString("nome") + " " + rs.getString("cpf"));
		}
		
		stmt.close();
		rs.close();
	}

	//Manipulações da conta
	private static void inserirConta(Connection conexao) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "insert into conta values (default,?,?,?)";
		PreparedStatement pstmt = conexao.prepareStatement(sql);
		
		//pstmt.setString(1, "");
		//pstmt.setString(2, "");
		//pstmt.setString(3, "");
		
		pstmt.execute();
		conexao.commit();
		pstmt.close();
		System.out.println("Conta cadastrada!");
	}
	
	private static void alterarConta(Connection conexao) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "update conta set saldo = ? where idconta = ?";
		PreparedStatement pstmt = conexao.prepareStatement(sql);
		
//		pstmt.setString(1, "Maria Ana dos Anjos");
//		pstmt.setString(2, "111.111.111-11");
		
		pstmt.execute();
		conexao.commit();
		pstmt.close();
		System.out.println("Conta alterada!");
	}
	
	private static void deletarConta(Connection conexao) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "delete from conta where numeroconta = ? and idconta = ?";
		PreparedStatement pstmt = conexao.prepareStatement(sql);
		
//		pstmt.setString(1, "Maria Ana dos Anjos");
//		pstmt.setString(2, "111.111.111-11");
		
		pstmt.execute();
		conexao.commit();
		pstmt.close();
		System.out.println("Conta excluida!");
	}
	
	private static void consultarConta(Connection conexao) throws SQLException {
		// TODO Auto-generated method stub
		Statement stmt = conexao.createStatement();
		String sql = "select * from conta";
		ResultSet rs = stmt.executeQuery(sql);
		
		while (rs.next()) {
			System.out.println("Id: " + rs.getInt("idconta") + " " + rs.getInt("idcliente") + " " + rs.getString("numeroconta") + " " + rs.getFloat("saldo"));
		}
		
		stmt.close();
		rs.close();
	}
	
	//Manipulações do histórico
	private static void inserirHistorico(Connection conexao) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "insert into historico values (default,?,?,?,?)";
		PreparedStatement pstmt = conexao.prepareStatement(sql);
		
		//pstmt.setString(1, "");
		//pstmt.setString(2, "");
		//pstmt.setString(3, "");
		
		pstmt.execute();
		conexao.commit();
		pstmt.close();
		System.out.println("Histórico cadastrado!");
	}
	
	private static void alterarHistorico(Connection conexao) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "update historico set valor = ? where idhistorico = ?";
		PreparedStatement pstmt = conexao.prepareStatement(sql);
		
//		pstmt.setString(1, "Maria Ana dos Anjos");
//		pstmt.setString(2, "111.111.111-11");
		
		pstmt.execute();
		conexao.commit();
		pstmt.close();
		System.out.println("Histórico alterado!");
	}
	
	private static void deletarHistorico(Connection conexao) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "delete from conta where idconta = ? and idhistorico = ?";
		PreparedStatement pstmt = conexao.prepareStatement(sql);
		
//		pstmt.setString(1, "Maria Ana dos Anjos");
//		pstmt.setString(2, "111.111.111-11");
		
		pstmt.execute();
		conexao.commit();
		pstmt.close();
		System.out.println("Histórico excluido!");
	}
	
	private static void consultarHistorico(Connection conexao) throws SQLException {
		// TODO Auto-generated method stub
		Statement stmt = conexao.createStatement();
		String sql = "select * from conta";
		ResultSet rs = stmt.executeQuery(sql);
		
		while (rs.next()) {
			System.out.println("Id: " + rs.getInt("idhistorico") + " " + rs.getInt("tipo_operacao") + " " + rs.getFloat("valor") + " " + rs.getString("saldo") + " " + rs.getInt("idconta"));
		}
		
		stmt.close();
		rs.close();
	}

}

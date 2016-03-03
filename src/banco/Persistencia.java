package banco;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.time.LocalDate;
import java.util.Calendar;

public class Persistencia {
	
	//Manipulações do cliente
	public static void inserirCliente(Connection conexao) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "insert into cliente values (default,?,?)";
		PreparedStatement pstmt = conexao.prepareStatement(sql);
		
		pstmt.setString(1, "Ruben");
		pstmt.setString(2, "123.456.789-00");
		
		pstmt.execute();
		conexao.commit();
		pstmt.close();
		System.out.println("Cliente inserido!");
	}
	
	public static void alterarCliente(Connection conexao) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "update cliente set nome = ? where cpf = ?";
		PreparedStatement pstmt = conexao.prepareStatement(sql);
		
		pstmt.setString(1, "Ruben Barbosa");
		pstmt.setString(2, "123.456.789-00");
		
		pstmt.execute();
		conexao.commit();
		pstmt.close();
		System.out.println("Cliente alterado!");
	}

	public static void deletarCliente(Connection conexao) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "delete from cliente where nome = ? and cpf = ?";
		PreparedStatement pstmt = conexao.prepareStatement(sql);
		
		pstmt.setString(1, "Ruben Barbosa");
		pstmt.setString(2, "123.456.789-00");
		
		pstmt.execute();
		conexao.commit();
		pstmt.close();
		System.out.println("Cliente excluido!");
	}
	
	public static void consultarCliente(Connection conexao) throws SQLException {
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
	public static void inserirConta(Connection conexao) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "insert into conta values (default,?,?,?)";
		PreparedStatement pstmt = conexao.prepareStatement(sql);
		
		pstmt.setFloat(1, 0.f);				//saldo
		pstmt.setInt(2, 2);					//idcliente
		pstmt.setString(3, "1234-5");		//numeroconta
		
		pstmt.execute();
		conexao.commit();
		pstmt.close();
		System.out.println("Conta cadastrada!");
	}
	
	public static void alterarConta(Connection conexao) throws SQLException {
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
	
	public static void deletarConta(Connection conexao) throws SQLException {
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
	
	public static void consultarConta(Connection conexao) throws SQLException {
		// TODO Auto-generated method stub
		Statement stmt = conexao.createStatement();
		String sql = "select * from conta";
		ResultSet rs = stmt.executeQuery(sql);
		
		while (rs.next()) {
			System.out.println("Id: " + rs.getInt("idconta") + " Id Cliente: "  + rs.getInt("idcliente") + " Númedo da conta:  " + rs.getString("numeroconta") + " Saldo: " + rs.getFloat("saldo"));
		}
		
		stmt.close();
		rs.close();
	}
	
	//Manipulações do histórico
	public static void inserirHistorico(Connection conexao) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "insert into historico values (default,?,?,?,?)";
		PreparedStatement pstmt = conexao.prepareStatement(sql);
		
		pstmt.setInt(1, 1);											//tipo_operacao
		pstmt.setFloat(2, 400f);									//valor
		pstmt.setDate(3, Date.valueOf(LocalDate.now()) );			//data
		pstmt.setInt(4, 2);											//idconta
		
		pstmt.execute();
		conexao.commit();
		pstmt.close();
		System.out.println("Histórico cadastrado!");
	}
	
	public static void alterarHistorico(Connection conexao) throws SQLException {
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
	
	public static void deletarHistorico(Connection conexao) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "delete from historico where idconta = ? and idhistorico = ?";
		PreparedStatement pstmt = conexao.prepareStatement(sql);
		
//		pstmt.setString(1, "Maria Ana dos Anjos");
//		pstmt.setString(2, "111.111.111-11");
		
		pstmt.execute();
		conexao.commit();
		pstmt.close();
		System.out.println("Histórico excluido!");
	}
	
	public static void consultarHistorico(Connection conexao) throws SQLException {
		// TODO Auto-generated method stub
		Statement stmt = conexao.createStatement();
		String sql = "select * from historico";
		ResultSet rs = stmt.executeQuery(sql);
		
		while (rs.next()) {
			System.out.println("Id: " + rs.getInt("idhistorico") + " " + rs.getInt("tipo_operacao") + " " + rs.getFloat("valor") + " " + rs.getDate("data_operacao") + " " + rs.getInt("idconta"));
		}
		
		stmt.close();
		rs.close();
	}

}

package main;

import java.sql.Connection;
import java.sql.SQLException;

import banco.Conexao;
import banco.Persistencia;

public class Main {
	
	private static Connection conn;

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		conn = Conexao.getConnection();
		conn.setAutoCommit(false);
//		Persistencia.inserirCliente(conn);
//		Persistencia.alterarCliente(conn);
//		Persistencia.deletarCliente(conn);
		Persistencia.consultarCliente(conn);
		
//		Persistencia.inserirConta(conn);
//		Persistencia.alterarConta(conn);
//		Persistencia.deletarConta(conn);
		Persistencia.consultarConta(conn);
		
//		Persistencia.inserirHistorico(conn);
//		Persistencia.alterarHistorico(conn);
//		Persistencia.deletarHistorico(conn);
		Persistencia.consultarHistorico(conn);
		
		conn.close();
		System.out.println("Banco fechado!");

	}

}

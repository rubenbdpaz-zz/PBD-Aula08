package main;

import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.*;

import banco.Conexao;


public class Main extends JFrame{
	
	public Main() throws SQLException{
		Connection conn;
		conn = Conexao.getConnection();
		setTitle("Menu");
		setSize(800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Definindo o Menu
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		//Menu
		JMenu clientesMenu = new JMenu("Clientes");
		JMenu contasMenu = new JMenu("Contas");
		JMenu historicoMenu = new JMenu("Histórico");
		
		menuBar.add(clientesMenu);
		menuBar.add(contasMenu);
		menuBar.add(historicoMenu);
		
		//Itens do Menu Cliente
		JMenuItem inserirCliente = new JMenuItem("Inserir Cliente");
		JMenuItem alterarCliente = new JMenuItem("Alterar Cliente");
		JMenuItem removerCliente = new JMenuItem("Remover Cliente");
		JMenuItem listarCliente = new JMenuItem("Listar Clientes");
				
		clientesMenu.add(inserirCliente);
		clientesMenu.add(alterarCliente);
		clientesMenu.add(removerCliente);
		clientesMenu.add(listarCliente);
		
		//Itens do Menu Contas
		JMenuItem inserirConta = new JMenuItem("Inserir Conta");
		JMenuItem alterarConta = new JMenuItem("Alterar Conta");
		JMenuItem removerConta = new JMenuItem("Remover Conta");
		JMenuItem listarConta = new JMenuItem("Listar Contas");
						
		contasMenu.add(inserirConta);
		contasMenu.add(alterarConta);
		contasMenu.add(removerConta);
		contasMenu.add(listarConta);
		
		//Itens do Menu Histórico
		JMenuItem inserirHistorico = new JMenuItem("Inserir Histórico de Conta");
		JMenuItem alterarHistorico = new JMenuItem("Alterar Histórico de Conta");
		JMenuItem removerHistorico = new JMenuItem("Remover Histórico de Conta");
		JMenuItem listarHistorico = new JMenuItem("Listar Históricos de Contas");
						
		historicoMenu.add(inserirHistorico);
		historicoMenu.add(alterarHistorico);
		historicoMenu.add(removerHistorico);
		historicoMenu.add(listarHistorico);
	}
	
	private static Connection conn;

	public static void main(String[] args) throws SQLException{
		// TODO Auto-generated method stub
		
		Main m = new Main();
		m.setVisible(true);
		m.setExtendedState(JFrame.MAXIMIZED_BOTH);	
		
//		Persistencia.inserirCliente(conn);
//		Persistencia.alterarCliente(conn);
//		Persistencia.deletarCliente(conn);
//		Persistencia.consultarCliente(conn);
		
//		Persistencia.inserirConta(conn);
//		Persistencia.alterarConta(conn);
//		Persistencia.deletarConta(conn);
//		Persistencia.consultarConta(conn);
		
//		Persistencia.inserirHistorico(conn);
//		Persistencia.alterarHistorico(conn);
//		Persistencia.deletarHistorico(conn);
//		Persistencia.consultarHistorico(conn);


	}

}

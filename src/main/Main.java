package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.*;

import banco.Conexao;


public class Main extends JFrame{
	
	public Main() throws SQLException{
		Connection conn;
		conn = Conexao.getConnection();
		setTitle("Aula 08");
		setSize(800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Definindo o Menu
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		//Menu
		JMenu menu = new JMenu("Menu");
		menuBar.add(menu);
		
		//Itens do Menu Cliente
		JMenuItem cliente = new JMenuItem("Cliente");
		JMenuItem conta = new JMenuItem("Conta");
		JMenuItem historico = new JMenuItem("Historico");
				
		menu.add(cliente);
		menu.add(conta);
		menu.add(historico);
		getContentPane().setLayout(null);
		
		cliente.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Cliente().setVisible(true);
			}
		});
		
		conta.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Conta().setVisible(true);
			}
		});
		
		historico.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Historico().setVisible(true);
			}
		});
	}
	
	public static void main(String[] args) throws SQLException{
		// TODO Auto-generated method stub
		
		Main m = new Main();
		m.setVisible(true);
		m.setExtendedState(JFrame.MAXIMIZED_BOTH);
	}
}

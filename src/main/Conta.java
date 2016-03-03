package main;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTable;

public class Conta extends JFrame{
	private JTable table;
	Conta(){
		setSize(new Dimension(600, 400));
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("Conta");
		getContentPane().setLayout(null);
		
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
	    int x = (int) ((dimension.getWidth() - 600) / 2);
	    int y = (int) ((dimension.getHeight() - 400) / 2);
	    setLocation(x, y);
	    
	    table = new JTable();
		table.setBounds(10, 11, 421, 340);
		getContentPane().add(table);
		
		JButton btnAdicionarConta = new JButton("Adicionar Conta");
		btnAdicionarConta.setBounds(441, 97, 133, 38);
		getContentPane().add(btnAdicionarConta);
		
		JButton btnEditarConta = new JButton("Editar Conta");
		btnEditarConta.setBounds(441, 146, 133, 38);
		getContentPane().add(btnEditarConta);
		
		JButton btnDeletarConta = new JButton("Deletar Conta");
		btnDeletarConta.setBounds(441, 195, 133, 38);
		getContentPane().add(btnDeletarConta);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}

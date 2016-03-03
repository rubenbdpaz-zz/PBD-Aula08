package main;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import javax.swing.JScrollPane;
import java.awt.GridBagConstraints;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.Dimension;

public class Cliente extends JFrame{
	private JTable table;
	public Cliente() {
		setSize(new Dimension(600, 400));
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("Cliente");
		getContentPane().setLayout(null);
		
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
	    int x = (int) ((dimension.getWidth() - 600) / 2);
	    int y = (int) ((dimension.getHeight() - 400) / 2);
	    setLocation(x, y);
		
		table = new JTable();
		table.setBounds(10, 11, 421, 340);
		getContentPane().add(table);
		
		JButton btnNewButton = new JButton("Adicionar Cliente");
		btnNewButton.setBounds(441, 97, 133, 38);
		getContentPane().add(btnNewButton);
		
		JButton btnEditarCliente = new JButton("Editar Cliente");
		btnEditarCliente.setBounds(441, 146, 133, 38);
		getContentPane().add(btnEditarCliente);
		
		JButton btnDeletarCliente = new JButton("Deletar Cliente");
		btnDeletarCliente.setBounds(441, 195, 133, 38);
		getContentPane().add(btnDeletarCliente);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}

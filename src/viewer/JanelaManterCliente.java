package viewer;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JList;
import java.awt.Color;
import javax.swing.AbstractListModel;

public class JanelaManterCliente extends JFrame {

	private JPanel contentPane;

	// Create the frame
	public JanelaManterCliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnIncluir = new JButton("Incluir");
		btnIncluir.setBounds(10, 227, 89, 23);
		contentPane.add(btnIncluir);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAlterar.setBounds(170, 227, 89, 23);
		contentPane.add(btnAlterar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnExcluir.setBounds(335, 227, 89, 23);
		contentPane.add(btnExcluir);
		
		JList list = new JList();

		DefaultListModel listModel = new DefaultListModel();
		listModel.addElement("Jane Doe");
		listModel.addElement("John Smith");
		listModel.addElement("Kathy Green");
		list.setModel(listModel);
		
		list.setBackground(Color.WHITE);
		list.setBounds(10, 11, 414, 205);
		contentPane.add(list);
		
	}
}

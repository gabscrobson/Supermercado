package viewer;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import controller.CtlrPrograma;
import model.Cliente;
import model.dao.DaoCliente;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.AbstractListModel;

public class JanelaManterCliente extends JFrame {

	private JPanel contentPane;

	// Create the frame
	public JanelaManterCliente() {
		setVisible(true);
		setResizable(false);
		setTitle("Manter Cliente");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		// JList
		JList<Cliente> list = new JList<>();

		DefaultListModel<Cliente> listModel = new DefaultListModel<>();
		for (Cliente c : DaoCliente.getClientes()) {
			listModel.addElement(c);
		}
		list.setModel(listModel);
		
		list.setBackground(Color.WHITE);
		list.setBounds(10, 11, 414, 205);
		contentPane.add(list);

		// JScrollPane to JList
		JScrollPane scrollPane = new JScrollPane(list);
		scrollPane.setBounds(10, 11, 414, 205);
		contentPane.add(scrollPane);
		
		// Buttons
		JButton btnIncluir = new JButton("Incluir");
		btnIncluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new JanelaIncluirCliente();
			}
		});
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
				Cliente selecionado = (Cliente) list.getSelectedValue();
				if (selecionado != null) {
					DaoCliente.excluirCliente(selecionado);
					listModel.removeElement(selecionado);
				}
				else
					JOptionPane.showMessageDialog(null, "Selecione um cliente para excluir");
			}
		});
		btnExcluir.setBounds(335, 227, 89, 23);
		contentPane.add(btnExcluir);
		
	}
}

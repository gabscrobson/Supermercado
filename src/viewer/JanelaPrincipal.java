package viewer;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaPrincipal extends JFrame {

	private JPanel contentPane;

	// Create the frame
	public JanelaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCliente = new JButton("Cliente");
		btnCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JanelaManterCliente janelaCliente = new JanelaManterCliente();
				janelaCliente.setVisible(true);
			}
		});
		btnCliente.setBounds(27, 106, 113, 36);
		contentPane.add(btnCliente);
		
		JButton btnCompra = new JButton("Compra");
		btnCompra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnCompra.setBounds(162, 106, 113, 36);
		contentPane.add(btnCompra);
		
		JButton btnProduto = new JButton("Produto");
		btnProduto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnProduto.setBounds(297, 106, 113, 36);
		contentPane.add(btnProduto);
	}
}

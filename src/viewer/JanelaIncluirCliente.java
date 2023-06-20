package viewer;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class JanelaIncluirCliente extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	public JanelaIncluirCliente() {
		setVisible(true);
		setResizable(false);
		setTitle("Incluir Cliente");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(10, 32, 59, 25);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(92, 35, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}

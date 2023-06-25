package viewer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.CtrlPrograma;

public class JanelaPrincipal extends AbstractViewer {

	private JPanel 		  contentPane;

	/**
	 * Create the frame.
	 */
	public JanelaPrincipal(CtrlPrograma meuCtrl) {
		super(meuCtrl);
		setResizable(false);
		
		setTitle("Supermercado");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btPessoa = new JButton("Cliente");
		btPessoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CtrlPrograma ctrl = (CtrlPrograma)getMeuControlador();
				ctrl.iniciarManterClientes();
			}
		});
		btPessoa.setBounds(37, 79, 89, 38);
		contentPane.add(btPessoa);
		
		JButton btAluno = new JButton("Compra");
		btAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CtrlPrograma ctrl = (CtrlPrograma)getMeuControlador();
				ctrl.iniciarIncluirCompra();
			}
		});
		btAluno.setBounds(160, 79, 89, 38);
		contentPane.add(btAluno);
		
		JButton btCurso = new JButton("Produto");
		btCurso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CtrlPrograma ctrl = (CtrlPrograma)getMeuControlador();
				ctrl.iniciarManterProdutos();
			}
		});
		btCurso.setBounds(283, 79, 89, 38);
		contentPane.add(btCurso);
		
		JButton btSair = new JButton("Sair");
		btSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CtrlPrograma ctrl = (CtrlPrograma)getMeuControlador();
				ctrl.encerrar();
			}
		});
		btSair.setBounds(160, 167, 89, 29);
		contentPane.add(btSair);
	}
}


package controller;

import model.Cliente;
import model.Compra;
import model.ItemCompra;
import model.Produto;
import model.dao.AbstractDao;
import model.dao.DaoCliente;
import viewer.JanelaPrincipal;

public class CtlrPrograma {

	public static void iniciar() {
		AbstractDao.recuperarObjetos();
		System.out.println("Iniciando programa...");
		JanelaPrincipal frame = new JanelaPrincipal();
		frame.addWindowListener(
			new java.awt.event.WindowAdapter() {
				@Override
				public void windowClosing(java.awt.event.WindowEvent windowEvent) {
					CtlrPrograma.encerrar();
				}
			}
		);
	}

	public static void encerrar() {
		AbstractDao.armazenarObjetos();
		System.out.println("Encerrando programa...");
		System.exit(0);
	}

	public static void main(String[] args) throws Exception{
		CtlrPrograma.iniciar();

		// Teste de serialização
		// DaoCliente.incluirCliente(new Cliente("157.900.387-77", "Lucas", "Rua 5", "(22)99264-1163"));
		// DaoCliente.incluirCliente(new Cliente("159.029.387-72", "Thais", "Rua 6", "(21)97264-1163"));
	}

}

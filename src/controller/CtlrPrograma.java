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
		JanelaPrincipal frame = new JanelaPrincipal();
		frame.setVisible(true);
	}

	public static void encerrar() {
		AbstractDao.armazenarObjetos();
		System.exit(0);
	}

	public static void main(String[] args) throws Exception{
		CtlrPrograma.iniciar();

		// Teste de serialização
		DaoCliente.incluirCliente(new Cliente("157.900.387-77", "Pedro", "Rua 5", "(22)99264-1163"));
		DaoCliente.incluirCliente(new Cliente("159.029.387-72", "Rosangela", "Rua 6", "(21)97264-1163"));

		for (Cliente cliente : DaoCliente.getClientes()) {
			System.out.println(cliente);
		}
	}

}

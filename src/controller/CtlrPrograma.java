package controller;

import model.Cliente;
import model.Compra;
import model.ItemCompra;
import model.Produto;
import model.dao.AbstractDao;
import model.dao.DaoCliente;

public class CtlrPrograma {

	public static void iniciar() {
		AbstractDao.recuperarObjetos();
		// JanelaPrincipal janela = new JanelaPrincipal(this);
		// janela.setVisible(true);
	}

	public static void encerrar() {
		AbstractDao.armazenarObjetos();
		System.exit(0);
	}

	public static void main(String[] args) throws Exception{
		CtlrPrograma.iniciar();

		// Teste de serialização
		Cliente[] clientes = new Cliente[2];
		clientes[0] = new Cliente("157.900.387-77", "Lucas", "Rua 4", "(22)99364-1163");
		clientes[1] = new Cliente("159.029.387-72", "Matheus", "Rua 3", "(21)98264-1163");
		DaoCliente.incluirClientes(clientes);

		for (Cliente cliente : DaoCliente.getClientes()) {
			System.out.println(cliente);
		}

		CtlrPrograma.encerrar();
	}

}

package controller;

import model.Cliente;
import model.Compra;
import model.ItemCompra;
import model.Produto;

public class Programa {

	public static void main(String[] args) throws Exception {
		Produto p = new Produto("1234567890123", "Arroz", 10);
		Cliente c = new Cliente("12345678", "João", "Rua 1", "12345678");
		System.out.println(p);
		System.out.println(c);
	}

}

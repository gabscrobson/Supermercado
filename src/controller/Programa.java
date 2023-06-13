package controller;

import model.Cliente;
import model.Compra;
import model.ItemCompra;
import model.Produto;

public class Programa {

	public static void main(String[] args) throws Exception {

		Cliente c = new Cliente("123.456.789-00", "Fulano", "Rua 1", "(22)99264-1163");
		Produto p = new Produto("1234567890123", "Produto 1", 10);
		ItemCompra ic = new ItemCompra(5, p);

		System.out.println(c);
		System.out.println(p);
		System.out.println(ic);

	}

}

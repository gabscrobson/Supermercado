package model;

import java.time.LocalDateTime;

public class Compra {
    // Atributos
    private String notaFiscal;
    private LocalDateTime data;
    private Cliente cliente;
    private ItemCompra[] itens;

    // Construtor
    public Compra(String notaFiscal, Cliente cliente, ItemCompra[] itens) throws Exception {
        this.setNotaFiscal(notaFiscal);
        this.data = LocalDateTime.now();
        this.setCliente(cliente);
        this.setItens(itens);
    }

    // Getters e Setters
    public String getNotaFiscal() {
        return notaFiscal;
    }
    public void setNotaFiscal(String notaFiscal) throws Exception {
        this.notaFiscal = notaFiscal;
    }

    public LocalDateTime getData() {
        return data;
    }

    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) throws Exception {
        this.cliente = cliente;
    }

    public ItemCompra[] getItens() {
        return itens;
    }
    public void setItens(ItemCompra[] itens) throws Exception {
        this.itens = itens;
    }

    // Métodos
    public float getValorTotal() {
        float valorTotal = 0;
        for (ItemCompra item : this.getItens()) {
            valorTotal += item.getPrecoTotal();
        }
        return valorTotal;
    }
}

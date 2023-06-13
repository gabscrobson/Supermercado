package model;

import java.time.LocalDateTime;

public class Compra {
    // Constantes
    final public static int TAM_NOTA_FISCAL = 13;

    // Atributos
    private String notaFiscal;
    private LocalDateTime data;
    private Cliente cliente;
    private ItemCompra[] itens;

    // Construtor
    public Compra(Cliente cliente, ItemCompra[] itens) throws Exception {
        this.setNotaFiscal(notaFiscal);
        this.setData();
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
    public void setData() throws Exception {
        this.data = LocalDateTime.now();
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

    // Validações


    // Métodos
    public float getValorTotal() {
        float valorTotal = 0;
        for (ItemCompra item : this.getItens()) {
            valorTotal += item.getPrecoTotal();
        }
        return valorTotal;
    }
}

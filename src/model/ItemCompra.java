package model;

public class ItemCompra {
    // Atributos
    private int quantidade;
    private float precoUnitario;
    private Produto produto;

    // Construtor
    public ItemCompra(int quantidade, float precoUnitario, Produto produto) throws Exception {
        this.setQuantidade(quantidade);
        this.setPrecoUnitario(precoUnitario);
        this.setProduto(produto);
    }

    // Getters e Setters
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) throws Exception {
        this.quantidade = quantidade;
    }

    public float getPrecoUnitario() {
        return precoUnitario;
    }
    public void setPrecoUnitario(float precoUnitario) throws Exception {
        this.precoUnitario = precoUnitario;
    }

    public Produto getProduto() {
        return produto;
    }
    public void setProduto(Produto produto) throws Exception {
        this.produto = produto;
    }

    // Métodos
    public float getPrecoTotal() {
        return this.getQuantidade() * this.getPrecoUnitario();
    }
}

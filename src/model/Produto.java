package model;

public class Produto {
    // Atributos
    private String codigoDeBarras;
    private String nome;
    private float precoAtual;

    // Construtor
    public Produto(String codigoDeBarras, String nome, float precoAtual) throws Exception {
        this.setCodigoDeBarras(codigoDeBarras);
        this.setNome(nome);
        this.setPrecoAtual(precoAtual);
    }

    // Getters e Setters
    public String getCodigoDeBarras() {
        return codigoDeBarras;
    }
    public void setCodigoDeBarras(String codigoDeBarras) throws Exception {
        this.codigoDeBarras = codigoDeBarras;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) throws Exception {
        this.nome = nome;
    }

    public float getPrecoAtual() {
        return precoAtual;
    }
    public void setPrecoAtual(float precoAtual) throws Exception {
        this.precoAtual = precoAtual;
    }

    // Métodos
    public String toString() {
        return this.getNome() + " - " + this.getCodigoDeBarras() + " - R$ " + this.getPrecoAtual();
    }
}

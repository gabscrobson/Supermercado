package model;

public class Cliente {
	// Atributos
    private String cpf;
    private String nome;
    private String endereco;
    private String telefone;

    // Construtor
    public Cliente(String cpf, String nome, String endereco, String telefone) throws Exception {
        this.setCpf(cpf);
        this.setNome(nome);
        this.setEndereco(endereco);
        this.setTelefone(telefone);
    }

    // Getters e Setters
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) throws Exception {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) throws Exception {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) throws Exception {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) throws Exception {
        this.telefone = telefone;
    }

    // Métodos
    public String toString() {
        return this.getNome() + " - " + this.getCpf() + " - " + this.getEndereco() + " - " + this.getTelefone();
    }
}

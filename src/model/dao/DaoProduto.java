package model.dao;

import java.util.ArrayList;

import model.Produto;

public class DaoProduto {
    // Copilot do it like DaoCliente.java this
    // // Atributos estáticos
    // private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();

    // // Métodos
    // // Inclui uma lista de clientes na lista estática
    // public static void incluirClientes(Cliente[] novaLista) throws Exception {
    //     for (int i = 0; i < novaLista.length; i++) {
    //         DaoCliente.clientes.add(novaLista[i]);
    //     }
    // }

    // // Retorna uma cópia da lista de clientes
    // public static Cliente[] getClientes() {
    //     Cliente[] copia = new Cliente[DaoCliente.getNumClientes()];
	// 	for(int i = 0; i < copia.length; i++)
	// 		copia[i] = DaoCliente.getClienteIndice(i);
	// 	return copia;
    // }

    // // Retorna o número de clientes cadastrados
    // public static int getNumClientes() {
    //     return DaoCliente.clientes.size();
    // }

    // // Retorna o cliente de um determinado índice
    // public static Cliente getClienteIndice(int indice) {
    //     return DaoCliente.clientes.get(indice);
    // }

    // // Retorna o cliente de um determinado CPF
    // public static Cliente getClienteCpf(String cpf) {
    //     for (Cliente cliente : DaoCliente.clientes) {
    //         if (cliente.getCpf().equals(cpf)) {
    //             return cliente;
    //         }
    //     }
    //     return null;
    // }

    // // Exclui um cliente
    // public static void excluirCliente(Cliente cliente) throws Exception {
    //     if (DaoCliente.clientes.contains(cliente))
    //         DaoCliente.clientes.remove(cliente);
    //     else
    //         throw new Exception("Cliente não encontrado!");
    // }

    // // Altera um cliente
    // public static void alterarCliente(Cliente cliente) throws Exception {
    //     Cliente clienteAntigo = DaoCliente.getClienteCpf(cliente.getCpf());
    //     if (clienteAntigo != null) {
    //         clienteAntigo.setNome(cliente.getNome());
    //         clienteAntigo.setEndereco(cliente.getEndereco());
    //         clienteAntigo.setTelefone(cliente.getTelefone());
    //     }
    //     else
    //         throw new Exception("Cliente não encontrado!");
    // }

    // Atributos estáticos
    private static ArrayList<Produto> produtos = new ArrayList<Produto>();

    // Métodos
    // Inclui uma lista de produtos na lista estática
    public static void incluirProdutos(Produto[] novaLista) throws Exception {
        for (int i = 0; i < novaLista.length; i++) {
            DaoProduto.produtos.add(novaLista[i]);
        }
    }

    // Retorna uma cópia da lista de produtos
    public static Produto[] getProdutos() {
        Produto[] copia = new Produto[DaoProduto.getNumProdutos()];
        for(int i = 0; i < copia.length; i++)
            copia[i] = DaoProduto.getProdutoIndice(i);
        return copia;
    }

    // Retorna o número de produtos cadastrados
    public static int getNumProdutos() {
        return DaoProduto.produtos.size();
    }

    // Retorna o produto de um determinado índice
    public static Produto getProdutoIndice(int indice) {
        return DaoProduto.produtos.get(indice);
    }

    // Retorna o produto de um determinado código de barras
    public static Produto getProdutoCodigoDeBarras(String codigoDeBarras) {
        for (Produto produto : DaoProduto.produtos) {
            if (produto.getCodigoDeBarras().equals(codigoDeBarras)) {
                return produto;
            }
        }
        return null;
    }

    // Exclui um produto
    public static void excluirProduto(Produto produto) throws Exception {
        if (DaoProduto.produtos.contains(produto))
            DaoProduto.produtos.remove(produto);
        else
            throw new Exception("Produto não encontrado!");
    }

    // Altera um produto
    public static void alterarProduto(Produto produtoAntigo, Produto produtoNovo) throws Exception {
        if (DaoProduto.produtos.contains(produtoAntigo)) {
            produtoAntigo.setNome(produtoNovo.getNome());
            produtoAntigo.setPrecoAtual(produtoNovo.getPrecoAtual());
            produtoAntigo.setCodigoDeBarras(produtoNovo.getCodigoDeBarras());
        }
        else
            throw new Exception("Produto não encontrado!");
    }

    

}

package com.dio.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(String nome, int codigo, int quantidade, double preco) {
        produtoSet.add(new Produto(nome, codigo, quantidade, preco));
    }

    public Set<Produto> exibirProdutosPorNome() {
        return new TreeSet<>(produtoSet);  // Retorna os produtos ordenados por nome
    }

    public void exibirTodosProdutos() {
        for (Produto produto : produtoSet) {
            System.out.println(produto);
        }
    }

    public static void main(String[] args) {
        CadastroProdutos cadastro = new CadastroProdutos();

        cadastro.adicionarProduto("Teclado", 1, 50, 99.90);
        cadastro.adicionarProduto("Mouse", 2, 30, 59.90);
        cadastro.adicionarProduto("Monitor", 3, 20, 799.90);
        cadastro.adicionarProduto("Cadeira", 4, 10, 299.90);

        System.out.println("Produtos ordenados por nome:");
        for (Produto produto : cadastro.exibirProdutosPorNome()) {
            System.out.println(produto);
        }

        System.out.println("\nTodos os produtos:");
        cadastro.exibirTodosProdutos();
    }
}

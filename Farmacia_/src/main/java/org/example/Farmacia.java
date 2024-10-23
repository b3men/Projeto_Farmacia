package org.example;

import java.util.ArrayList;

public class Farmacia {
    private ArrayList<Produto> produtos = new ArrayList<>();

    public void cadastrarProduto(Produto produto) {
        String ret = " ";
        produtos.add(produto);
        ret += "Produto cadastrado \n" + produto + "\n";
    }

    public void listarProdutos() {
        String ret = " ";
        for (Produto produto : produtos) {
           ret += "Lista de Produtos \n" + produto + "\n";
        }
    }
}

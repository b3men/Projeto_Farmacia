package org.example;

public class Produto {
    protected String nome;
    protected int qtdEstoque;
    protected double valor;


    public Produto(String nome, int qtdEstoque, double valor) {
        this.nome = nome;
        this.qtdEstoque = qtdEstoque;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return null;
    }

    public void fazVenda(int quantidade) {
        qtdEstoque -= quantidade;
    }

    @Override
    public String toString() {
        return "Tipo: " + getTipo() + ", Produto: " + nome +
                ", Estoque: " + qtdEstoque + ", Valor: R$ " + valor;
    }
}

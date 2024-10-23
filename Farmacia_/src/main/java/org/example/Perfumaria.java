package org.example;

public class Perfumaria extends Produto {
    protected double divida;

    public Perfumaria(String nome, int qtdEstoque, double valor) {
        super(nome, qtdEstoque, valor);
    }

    public boolean saldoPositivo() {
        if (divida < 100) return true;
        else return false;
    }

    public boolean temEstoque(){
        return qtdEstoque > 0;
    }

    @Override
    public String getTipo() {
        return "Perfumaria";
    }
}

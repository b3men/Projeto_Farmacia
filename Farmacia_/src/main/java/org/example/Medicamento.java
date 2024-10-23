package org.example;

public class Medicamento extends Produto{
    protected boolean necessarioReceita;

    public Medicamento(String nome, int qtdEstoque, double valor, boolean necessarioReceita) {
        super(nome, qtdEstoque, valor);
        this.necessarioReceita = necessarioReceita;
    }

    public boolean isNecessarioReceita() {
        return necessarioReceita;
    }

    public void setNecessarioReceita(boolean necessarioReceita) {
        this.necessarioReceita = necessarioReceita;
    }

    public boolean temEstoque(){
        return qtdEstoque > 0;
    }

    @Override
    public String getTipo() {
        return "Medicamento";
    }
}

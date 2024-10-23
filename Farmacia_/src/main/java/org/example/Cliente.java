package org.example;

public class Cliente {
    protected String nome;
    protected double saldoDevedor;

    public Cliente(String nome, double saldoDevedor) {
        this.nome = nome;
        this.saldoDevedor = saldoDevedor;
    }

    public String getNome() {
        return nome;
    }

    public double getSaldoDevedor() {
        return saldoDevedor;
    }

    public void pagar(double valor) {
        if (valor >= saldoDevedor) {
            saldoDevedor = 0;
        } else {
            saldoDevedor -= valor;
        }
    }

    @Override
    public String toString() {
        return "Cliente: " + nome + ", Saldo Devedor: R$ " + saldoDevedor;
    }
}
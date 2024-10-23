package org.example;

public class EquipamentoMedico extends Produto {
    protected boolean fazerEncomenda;

    public EquipamentoMedico(String nome, int qtdEstoque, double valor, boolean fazerEncomenda) {
        super(nome, qtdEstoque, valor);
        this.fazerEncomenda = fazerEncomenda;
    }

   public boolean isEncomenda(){
        return fazerEncomenda;
   }
    @Override
    public String getTipo() {
        return "Equipamento Médico";
    }
}

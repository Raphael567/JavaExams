package br.com.etechoracio.ControleDespesa.models;

public class Alimentacao extends Despesa {
    private String nomeRestaurante;
    private int qtdRefeicao;

    public String getNomeRestaurante() {
        return nomeRestaurante;
    }

    public void setNomeRestaurante(String nomeRestaurante) {
        this.nomeRestaurante = nomeRestaurante;
    }

    public int getQtdRefeicao() {
        return qtdRefeicao;
    }

    public void setQtdRefeicao(int qtdRefeicao) {
        this.qtdRefeicao = qtdRefeicao;
    }

    //@Override
    public void cadastrarDespesa(String descricao, String nomeRestaurante, int qtdRefeicao) {
        super.cadastrarDespesa(descricao);
        this.nomeRestaurante = nomeRestaurante;
        this.qtdRefeicao = qtdRefeicao;
    }

    @Override
    public double calcularDespesa() {
        double valorTotal = qtdRefeicao * 18;

        return valorTotal;
    }

    @Override
    public String listarDespesa() {
        String exibeDespesa = String.format("Quantiade de Refeição: " + getQtdRefeicao() + "\nNomeRestaurante: " + getNomeRestaurante() + "\nCálculo da Despesa: " + calcularDespesa());
        return exibeDespesa;
    }
}

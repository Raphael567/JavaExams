package br.com.etechoracio.ControleDespesa.models;

public class Diaria extends Despesa {
    private double qtdDiaria;

    public double getQtdDiaria() {
        return qtdDiaria;
    }

    public void setQtdDiaria(double qtdDiaria) {
        this.qtdDiaria = qtdDiaria;
    }

    //@Override
    public void cadastrarDespesa(String descricao, double qtdDiaria) {
        super.cadastrarDespesa(descricao);
        this.qtdDiaria = qtdDiaria;
    }

    @Override
    public double calcularDespesa() {
        double valorTotal = qtdDiaria*50;

        return valorTotal;
    }

    @Override
    public String listarDespesa() {
        String exibeDespesa = String.format("Quantiade Diária: " + getQtdDiaria())  + "\nCálculo da Despesa: " + calcularDespesa();
        return exibeDespesa;
    }
}

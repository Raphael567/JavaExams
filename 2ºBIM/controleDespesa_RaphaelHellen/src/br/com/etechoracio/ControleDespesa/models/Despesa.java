package br.com.etechoracio.ControleDespesa.models;//Dupla : Raphael Pereira Canuto e Hellen Novi Salvador 2ºAI

public abstract class Despesa {
    private String descricao;
    private double valorTotal;

    public abstract double calcularDespesa();

    public abstract String listarDespesa();

    public void cadastrarDespesa(String descricao) {
        this.descricao = descricao;
        this.valorTotal = 0;
    }
}

package br.com.etechoracio.ControleDespesa.models;

public class Transporte extends Despesa {
    private double kmPercorrida;
    private double valorPedagios;

    public double getKmPercorrida() {
        return kmPercorrida;
    }

    public void setKmPercorrida(double kmPercorrida) {
        this.kmPercorrida = kmPercorrida;
    }

    public double getValorPedagios() {
        return valorPedagios;
    }

    public void setValorPedagios(double valorPedagios) {
        this.valorPedagios = valorPedagios;
    }

    //@Override
    public void cadastrarDespesa(String descricao, double kmPercorrida, double valorPedagios) {
        super.cadastrarDespesa(descricao);
        this.kmPercorrida = kmPercorrida;
        this.valorPedagios = valorPedagios;
    }

    @Override
    public double calcularDespesa() {
        double valorTotal = kmPercorrida * 3 + valorPedagios;

        return valorTotal;
    }

    @Override
    public String listarDespesa() {
        String exibeDespesa = String.format("Quilômetros Percorridos: " + getKmPercorrida() + "\nValor dos Pedágios: " + getValorPedagios()  + "\nCálculo da Despesa: " + calcularDespesa());
        return exibeDespesa;
    }
}
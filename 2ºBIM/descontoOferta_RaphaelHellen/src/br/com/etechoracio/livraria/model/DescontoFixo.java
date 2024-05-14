package br.com.etechoracio.livraria.model;

public class DescontoFixo implements Desconto{
    private double valor;

    public DescontoFixo(double valor) {
        this.valor = valor;
    }

    public double aplicar(double preco) {
        return preco-valor;
    }
}

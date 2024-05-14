package br.com.etechoracio.livraria.model;

public class Revista implements Exemplar, Oferta{
    private String titulo;
    private double valor;
    private Editora editora;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    @Override
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public double aplicarDesconto(Desconto desconto) {
        return 0;
    }
}

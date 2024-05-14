package br.com.etechoracio.livraria.model;

public class LivroCortesia extends Livro{
    private String marcaDagua;

    public void setValor(double valor) {}

    public LivroCortesia(String marcaDagua) {
        this.marcaDagua = marcaDagua;
    }

    protected void detalhar() {
        System.out.println("Valor da marca d'água: " + marcaDagua);
    }
}

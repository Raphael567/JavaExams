package br.com.etechoracio.livraria.model;

// Kindle herda de livro --> kindle é um livro
public class Kindle extends Livro implements Oferta{
    private String marcaDAgua;

    public String getMarcaDAgua() {
        return marcaDAgua;
    }

    public void setMarcaDAgua(String marcaDAgua) {
        this.marcaDAgua = marcaDAgua;
    }

    @Override
    public void aplicarDesconto(double percentual) {
        if(percentual > 0.1) {
            System.out.println("Desconto não pode ser maior que 10%");
        } else {
            super.aplicarDesconto(percentual);
        }
    }

    @Override
    protected void detalhar() {
            System.out.println("MarcaD'Água: " + getMarcaDAgua());
    }

    @Override
    public double aplicarDesconto(Desconto desconto) {
        return 0;
    }
}

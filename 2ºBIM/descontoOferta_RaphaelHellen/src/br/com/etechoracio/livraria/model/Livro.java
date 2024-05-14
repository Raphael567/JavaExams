package br.com.etechoracio.livraria.model;
import br.com.etechoracio.livraria.enums.tipoCapaEnum;
public abstract class Livro implements Exemplar{
    private String titulo;
    private String resumo;
    protected double valor;
    private String autor;
    private tipoCapaEnum tipoCapa;
    private Editora editora;
    private int paginas;

    public String getTitulo() {
        return titulo.toUpperCase();
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public double getValor() {
        return valor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setTipoCapa(tipoCapaEnum tipoCapa) {
        this.tipoCapa = tipoCapa;
        cobrarTipoCapa();
    }

    public tipoCapaEnum getTipoCapa() {
        return tipoCapa;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public void exibirLivro(){
        System.out.println("\nDETALHES DO LIVRO: \n");
        System.out.println("Título: " + getTitulo());
        System.out.println("Resumo: " + getResumo());
        System.out.println("Valor: " + formatarValor(getValor()));
        System.out.println("Autor: " + getAutor());
        System.out.println("Tipo de capa: " + getTipoCapa());
        getEditora().exibirEditora();
        System.out.println("Quantidade de páginas: " + getPaginas());
        System.out.println("Taxa de envio: " + formatarValor(getTaxaEnvio()));
        System.out.println("Livro com 15% de desconto: " + formatarValor(aplicarDesconto()));
        detalhar();
    }

    double getTaxaEnvio(){
         return valor * 0.05;
    }

    String formatarValor(double parametro){
         return String.format("R$ %.2f", parametro);
    }

    double aplicarDesconto() {
         return descontoLivro(0.05);
    }

    double descontoLivro(double percentual) {
        return valor - valor * percentual;
    }

    public void cobrarTipoCapa() {
        if (tipoCapa.equals(tipoCapa.DURA)) {
            valor += 5;
        } else if (tipoCapa.equals(tipoCapa.PERSONALIZADA)) {
            valor += 10;
        }
    }

    public void aplicarDesconto(double percentual){
        if(percentual > 0.2) {
            System.out.println("Desconto não pode ser maior que 20%");
        } else {
            valor = valor - valor * percentual;
        }
    }

    protected abstract void detalhar();
}

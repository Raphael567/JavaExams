package br.com.etechoracio.livraria.model;

import br.com.etechoracio.livraria.enums.tipoCapaEnum;

public class AudioLivro extends Livro {

    private tipoCapaEnum tipoCapa;

    public AudioLivro() {
        tipoCapa = tipoCapa.COMUM; // Define o tipo de capa como COMUM por padrão
        cobrarTipoCapa();
    }

    @Override
    double getTaxaEnvio() {
        return super.getTaxaEnvio();
    }

    public void cobrarTipoCapa() {
        if (tipoCapa.equals(tipoCapaEnum.DURA)) {
            valor += 5;
        } else if (tipoCapa.equals(tipoCapaEnum.PERSONALIZADA)) {
            valor += 10;
        }
    }

    @Override
    protected void detalhar() {
        System.out.printf("Taxa de Envio: %s", formatarValor(getTaxaEnvio()));
    }

    @Override
    public tipoCapaEnum getTipoCapa() {
        return tipoCapa;
    }

    @Override
    public void setTipoCapa(tipoCapaEnum tipoCapa) {
        this.tipoCapa = tipoCapa;
    }
}

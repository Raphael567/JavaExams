package br.com.etechoracio.livraria.model;

import br.com.etechoracio.livraria.enums.tipoCapaEnum;

public class LivroImpresso extends Livro implements Oferta{
    private tipoCapaEnum tipoCapa;

    double getTaxaEnvio(){
        return valor * 0.05;
    }

    public void cobrarTipoCapa() {
        if (tipoCapa.equals(tipoCapa.DURA)) {
            valor += 5;
        } else if (tipoCapa.equals(tipoCapa.PERSONALIZADA)) {
            valor += 10;
        }
    }

    public LivroImpresso() {
        tipoCapa = tipoCapaEnum.COMUM;
        cobrarTipoCapa();
    }

    @Override
    protected void detalhar() {
        System.out.println("Tipo de capa: " + tipoCapa);
        System.out.printf("Taxa de Envio: " + formatarValor(getTaxaEnvio()));
    }

    public double aplicarDesconto(Desconto desconto) {
        return desconto.aplicar(valor);
    }
}

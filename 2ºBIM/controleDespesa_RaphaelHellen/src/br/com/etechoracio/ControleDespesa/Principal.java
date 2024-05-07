package br.com.etechoracio.ControleDespesa;

import br.com.etechoracio.ControleDespesa.models.Alimentacao;
import br.com.etechoracio.ControleDespesa.models.Diaria;
import br.com.etechoracio.ControleDespesa.models.Transporte;

public class Principal {
    public static void main(String[] args) {
        Alimentacao alimentacao = new Alimentacao();

        System.out.println("\nAlimentação: ");

        alimentacao.setNomeRestaurante("Restaurante Legal");
        alimentacao.setQtdRefeicao(10);

        System.out.println(alimentacao.listarDespesa());

        System.out.println("\nTransporte: ");

        Transporte transporte = new Transporte();

        transporte.setKmPercorrida(50);
        transporte.setValorPedagios(10.0);

        System.out.println(transporte.listarDespesa());

        System.out.println("\nDiária: ");

        Diaria diaria = new Diaria();

        diaria.setQtdDiaria(5);

        System.out.println(diaria.listarDespesa());
    }
}

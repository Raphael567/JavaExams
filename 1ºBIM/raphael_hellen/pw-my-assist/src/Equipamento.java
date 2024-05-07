public class Equipamento {
    String cliente;
    int ordemDesignada;
    tipoAparelhoEnum tipoAparelho;
    String marca;
    String modelo;
    String numeroSerie;
    String problema;

//    public Equipamento(String cliente, int ordemDesignada, String tipoAparelho, String marca, String modelo, String numeroSerie, String problema) {
//        this.cliente = cliente;
//        this.ordemDesignada = ordemDesignada;
//        this.tipoAparelho = tipoAparelho;
//        this.marca = marca;
//        this.modelo = modelo;
//        this.numeroSerie = numeroSerie;
//        this.problema = problema;
//    }

    public void apresentarEquipamento() {
        String exibeClasse = String.format("""
                                            
                                            EQUIPAMENTO:
                                            Cliente: %s
                                            Ordem Designada: %d
                                            TipoAparelho: %s
                                            Marca: %s
                                            Modelo: %s
                                            NumeroSerie: %s
                                            Problema: %s""",
                                            cliente,
                                            ordemDesignada,
                                            tipoAparelho,
                                            marca,
                                            modelo,
                                            numeroSerie,
                                            problema);

        System.out.println(exibeClasse);
    }
}

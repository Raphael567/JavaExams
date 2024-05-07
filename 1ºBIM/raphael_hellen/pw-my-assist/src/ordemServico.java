public class ordemServico {
    int idOrdemServico;
    equipamentoEnum equipamento;
    String descricaoServico;
    String cliente;

    public void apresentarOrdemServico() {
        String exibeClasse = String.format("""
                                            
                                            ORDEM-SERVIÇO:
                                            ID Ordem de Serviço: %s
                                            Equipamento: %s
                                            Descrição do Serviço: %s
                                            Cliente: %s""", idOrdemServico, equipamento, descricaoServico, cliente);
        System.out.println(exibeClasse);
    }
}

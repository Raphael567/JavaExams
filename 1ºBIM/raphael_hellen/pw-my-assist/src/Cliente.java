public class Cliente {
    String nome;
    String cep;
    String telefone;
    int id;

    public Cliente(String nome, String cep, String telefone, int id) {
        this.nome = nome;
        this.cep = cep;
        this.telefone = telefone;
        this.id = id;
    }

    public void apresentarCliente() {
        String exibeClasse = String.format("""
                                            
                                            CLIENTE:
                                            Nome: %s
                                            CEP: %s
                                            Telefone:%s
                                            ID: %d""", nome, cep, telefone, id);
        System.out.println(exibeClasse);
    }
}

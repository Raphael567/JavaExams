import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Tecnico {
    String nome;
    String telefone;
    String cep;
    String cpf;
    LocalDate dataContratacao;

    public Tecnico(String nome, String telefone, String cep, String cpf, LocalDate dataContratacao) {
        this.nome = nome;
        this.telefone = telefone;
        this.cep = cep;
        this.cpf = cpf;
        this.dataContratacao = dataContratacao;
    }

    public void apresentarTecnico() {
        //GPT
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataContratacaoConvert = dataContratacao.format(formatter);

        String exibeClasse = String.format("""
                                            
                                            TÉCNICO:
                                            Nome: %s
                                            Telefone: %s
                                            Cep: %s
                                            CPF: %s
                                            Data Contratação: %s""", nome, telefone, cep, cpf, dataContratacaoConvert);
        System.out.println(exibeClasse);
    }
}

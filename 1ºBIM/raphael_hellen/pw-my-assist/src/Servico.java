import java.time.Period;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Servico {
    String tipoServico;
    int idServico;
    String tecnicoDesignado;
    double custo;
    LocalDate dataInicio;
    Period prazo;

    public Servico(String tipoServico, int idServico, String tecnicoDesignado, double custo, LocalDate dataInicio, Period prazo) {
        this.tipoServico = tipoServico;
        this.idServico = idServico;
        this.tecnicoDesignado = tecnicoDesignado;
        this.custo = custo;
        this.dataInicio = dataInicio;
        this.prazo = prazo;
    }

    public void apresentarServico() {
        String prazoConvert = String.format("%s", prazo.getDays());
        //GPT
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataInicioConvert = dataInicio.format(formatter);


        String exibeClasse = String.format("""
                                            
                                            SERIVÇO:
                                            Tipo de Serviço: %s
                                            ID do Serviço: %d
                                            Técnico Designado: %s
                                            Custo: %.2f
                                            Data de início: %s
                                            Prazo: %s dias""", tipoServico, idServico, tecnicoDesignado, custo, dataInicioConvert, prazoConvert);
        System.out.println(exibeClasse);
    }
}

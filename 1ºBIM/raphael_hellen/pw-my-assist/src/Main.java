import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {
    // Raphael Pereira Canuto
    // Hellen Novi Salvador

    public static void main(String[] args) {
        Cliente c = new Cliente("Raphael", "02112-001", "1198458-8198", 1);
        Servico s = new Servico("Conserto de Notebook", 1, "Bartolomeu", 75.00, LocalDate.of(2024, 3, 4), Period.ofDays(30));
        ordemServico oS = new ordemServico();
        oS.idOrdemServico = 1;
        oS.equipamento = equipamentoEnum.CHAVE_INGLESA;
        oS.descricaoServico = "O serviço deve ser feito da seguinte maneira...";
        oS.cliente = "Jorge";
        Tecnico t = new Tecnico("Pigmeu","1198458-8196", "02112-002", "527.598.942-89", LocalDate.of(2024, 3, 4));
        Equipamento e = new Equipamento();
        e.cliente = "Jorge";
        e.ordemDesignada = 1;
        e.tipoAparelho = tipoAparelhoEnum.NOTEBOOK;
        e.marca = "Positivo";
        e.modelo = "SimPlus";
        e.numeroSerie = "01234";
        e.problema = "Foi detectado os seguintes problemas...";
        Enunciado enunc = new Enunciado();

        Scanner scanner = new Scanner(System.in);

        String escolha = "";

        while(!escolha.equals("sair")) {
            enunc.enunciadoMenu();
            escolha = scanner.nextLine().toLowerCase();

            enunc.Menu(escolha, c, s, oS, t, e);
            enunc.systemPause(escolha);
            enunc.lineSystem();
        }
    }
}

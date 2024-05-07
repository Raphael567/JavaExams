import java.util.Scanner;

public class Enunciado {
    public void enunciadoMenu() {
        String exibeMenu = String.format("""

-------- ASSISTÊNCIA TÉCNICA --------
                    
- CLIENTE          - TÉCNICO
- SERVIÇO          - EQUIPAMENTO
- ORDEM SERVIÇO
--------------------------------------
                            
DIGITE A INFORMAÇÃO QUE VOCÊ DESEJA VISUALIZAR:
                    """);
        System.out.println(exibeMenu);
    }

    public void Menu(String x, Cliente c, Servico s, ordemServico oS, Tecnico t, Equipamento e) {
        switch (x) {
            case "cliente":
                c.apresentarCliente();
                break;
            case "serviço":
                s.apresentarServico();
                break;
            case "ordem serviço":
                oS.apresentarOrdemServico();
                break;
            case "técnico":
                t.apresentarTecnico();
                break;
            case "equipamento":
                e.apresentarEquipamento();
                break;
            case "sair":
                System.out.println("\nSaindo...");
                System.exit(0);
                break;
            default:
                System.out.println("\nInválido...");
        }
    }

    public void systemPause(String x) {
        Scanner scanner = new Scanner(System.in);
        if(!x.equals("sair")) {
            System.out.println("\nPressione Enter para continuar...");
            scanner.nextLine();
        }
    }

    public void lineSystem() {
        String newLines = "\n".repeat(100);
        System.out.println(newLines);
    }
}

import java.util.Scanner;

public class Questao17 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite seu estado civil (1 - Solteiro, 2 - Casado, 3 - Divorciado, 4 - Viúvo): ");
        int estadoCivil = leitor.nextInt();

        String mensagem;

        switch (estadoCivil) {
            case 1:
                mensagem = "Solteiro";
                break;
            case 2:
                mensagem = "Casado";
                break;
            case 3:
                mensagem = "Divorciado";
                break;
            case 4:
                mensagem = "Viúvo";
                break;
            default:
                mensagem = "Opção inválida";
                break;
        }

        System.out.println("Estado civil: " + mensagem);

        leitor.close();
    }
}
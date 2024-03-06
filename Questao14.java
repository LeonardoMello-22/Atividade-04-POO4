import java.util.Scanner;

public class Questao14 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número inteiro de 1 a 5: ");
        int numero = leitor.nextInt();

        String mensagem;

        switch (numero) {
            case 5:
                mensagem = "Muito bom";
                break;
            case 4:
                mensagem = "Bom";
                break;
            case 3:
                mensagem = "Regular";
                break;
            case 2:
                mensagem = "Insuficiente";
                break;
            case 1:
                mensagem = "Muito insuficiente";
                break;
            default:
                mensagem = "Número fora do intervalo válido.";
                break;
        }

        System.out.println(mensagem);

        leitor.close();
    }
}
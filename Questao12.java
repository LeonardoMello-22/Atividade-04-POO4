import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o número: ");
        int numero = leitor.nextInt();

        if (numero % 3 == 0 && numero % 5 == 0) {
            System.out.println("É divisível por 3 e por 5.");
        } else {
            System.out.println("Não é divisível por 3 e por 5.");
        }

        leitor.close();
    }
}
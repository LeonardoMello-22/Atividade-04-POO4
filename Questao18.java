import java.util.Scanner;

public class Questao18 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o 1° número: ");
        float numero1 = leitor.nextFloat();

        System.out.print("Digite o 2° número: ");
        float numero2 = leitor.nextFloat();

        System.out.print("Escolha a operação (1 - Soma, 2 - Subtração, 3 - Multiplicação, 4 - Divisão): ");
        int escolha = leitor.nextInt();

        float resultado;

        switch (escolha) {
            case 1:
                resultado = numero1 + numero2;
                System.out.println("Resultado da soma: " + resultado);
                break;
            case 2:
                resultado = numero1 - numero2;
                System.out.println("Resultado da subtração: " + resultado);
                break;
            case 3:
                resultado = numero1 * numero2;
                System.out.println("Resultado da multiplicação: " + resultado);
                break;
            case 4:
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                    System.out.println("Resultado da divisão: " + resultado);
                } else {
                    System.out.println("Não é possível dividir por zero.");
                }
                break;
            default:
                System.out.println("Opção inválida");
        }

        leitor.close();
    }
}
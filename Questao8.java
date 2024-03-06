import java.util.Arrays;
import java.util.Scanner;

public class Questao8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        int numero3 = scanner.nextInt();

        ordenaEImprime(numero1, numero2, numero3);

        scanner.close();
    }

    public static void ordenaEImprime(int a, int b, int c) {
        int[] numeros = {a, b, c};
        Arrays.sort(numeros);

        System.out.println("Números em ordem crescente: " + numeros[0] + ", " + numeros[1] + ", " + numeros[2]);
    }
}
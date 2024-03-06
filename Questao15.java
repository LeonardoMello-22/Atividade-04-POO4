import java.util.Scanner;

public class Questao15 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int dia = leitor.nextInt();

        if (dia == 1) {
            System.out.println("domingo");
        } else if (dia == 2) {
            System.out.println("segunda");
        } else if (dia == 3) {
            System.out.println("terça");
        } else if (dia == 4) {
            System.out.println("quarta");
        } else if (dia == 5) {
            System.out.println("quinta");
        } else if (dia == 6) {
            System.out.println("sexta");
        } else if (dia == 7) {
            System.out.println("sabado");
        } else {
            System.out.println("dia não reconhecido");
        }

        leitor.close();
    }
}
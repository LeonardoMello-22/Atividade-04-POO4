import java.util.Scanner;

public class Questao13 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe o dia da semana: ");
        String dia = leitor.next().toLowerCase();

        if (dia.equals("segunda") || dia.equals("terça") || dia.equals("quarta") || dia.equals("quinta") || dia.equals("sexta")) {
            System.out.println("Dia útil");
        } else if (dia.equals("sabado") || dia.equals("domingo")) {
            System.out.println("Fim de semana");
        } else {
            System.out.println("Informe o dia da semana corretamente.");
        }

        leitor.close();
    }
}
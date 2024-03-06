import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Salário: ");
        double salario = leitor.nextDouble();

        double aumento;

        if (salario > 1500.00) {
            aumento = salario * 0.10;
        } else {
            aumento = salario * 0.15;
        }

        double salarioNovo = salario + aumento;

        System.out.println("Salário inicial: R$" + salario);
        System.out.println("Aumento: R$" + aumento);
        System.out.println("Novo salário: R$" + salarioNovo);

        leitor.close();
    }
}
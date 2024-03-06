import java.util.Scanner;

public class Questao16 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        float idade = leitor.nextFloat();

          if (idade >= 0 && idade < 1) {
            System.out.println("bebê");
        } else if (idade >= 1 && idade < 12) {
            System.out.println("criança");
        } else if (idade >= 13 && idade < 18) {
            System.out.println("Adolescente");
        } else {
            System.out.println("Adulto");
        }

        leitor.close();
    }
}
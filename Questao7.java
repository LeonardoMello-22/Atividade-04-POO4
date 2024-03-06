import java.util.Scanner;

public class Questao7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um caractere: ");
        char caractere = scanner.next().charAt(0);

        if (ehVogal(caractere)) {
            System.out.println("O caractere é uma vogal.");
        } else {
            System.out.println("O caractere é uma consoante.");
        }

        scanner.close();
    }

    public static boolean ehVogal(char c) {
        char caractereLowerCase = Character.toLowerCase(c);
        return caractereLowerCase == 'a' || caractereLowerCase == 'e' || caractereLowerCase == 'i' ||
               caractereLowerCase == 'o' || caractereLowerCase == 'u';
    }
}
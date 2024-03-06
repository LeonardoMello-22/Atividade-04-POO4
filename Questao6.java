import java.util.Scanner;
public class Questao6 {
    public static void main(String[] args){
    Scanner leitor = new Scanner(System.in);

    System.out.print("Informe o 1°nome: ");
    String nome1 = leitor.nextLine();

    System.out.print("Informe o 2°nome: ");
    String nome2 = leitor.nextLine();

    int comprimentoNome1 = nome1.length();
    int comprimentoNome2 = nome2.length();


    if (comprimentoNome1 > comprimentoNome2){
        System.out.println("O maior é " + nome1);
    }else if (comprimentoNome1 < comprimentoNome2){
        System.out.println("O maior é " + nome2);
    }else{
        System.out.println("Os números são iguais em quantidade de caracteres");
    }
    leitor.close();
}
}

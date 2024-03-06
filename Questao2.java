import java.util.Scanner;
public class Questao2 {
    public static void main(String[] args){
    Scanner leitor = new Scanner(System.in);

    System.out.print("Digite sua idade: ");

    int idade = leitor.nextInt();

    if (idade > 18){
        System.out.println("É maior de idade");
    }else{
        System.out.println("é menor de idade");
    }
    leitor.close();
}
}

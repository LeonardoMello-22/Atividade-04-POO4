import java.util.Scanner;
public class Questao4 {
    public static void main(String[] args){
    Scanner leitor = new Scanner(System.in);

    System.out.print("Digite um número: ");

    int numero = leitor.nextInt();

    if (numero %2 == 0){
        System.out.println("É um número par ");
    }else{
        System.out.println("É um número ímpar ");
    }
    leitor.close();
    }    
}
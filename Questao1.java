import java.util.Scanner;
public class Questao1 {
    public static void main(String[] args){
    Scanner leitor = new Scanner(System.in);

    System.out.print("Digite um número: ");

    int numero = leitor.nextInt();

    if (numero > 0){
        System.out.println("É um número positivo");
    }else if (numero < 0){
        System.out.println("É um número negativo");
    }else{
        System.out.println("O número é zero");
    }
    leitor.close();
}
}
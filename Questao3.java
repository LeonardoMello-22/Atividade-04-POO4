import java.util.Scanner;
public class Questao3 {
    public static void main(String[] args){
    Scanner leitor = new Scanner(System.in);

    System.out.print("Digite o 1°número: ");
    int numero1 = leitor.nextInt();

    System.out.print("Digite o 2°número: ");
    int numero2 = leitor.nextInt();


    if (numero1 > numero2){
        System.out.println("O maior número é " + numero1);
    }else if (numero1 < numero2){
        System.out.println("O maior número é " + numero2);
    }else{
        System.out.println("Os números são iguais");
    }
    leitor.close();
}
}
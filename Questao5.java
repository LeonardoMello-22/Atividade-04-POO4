import java.util.Scanner;
public class Questao5 {
    public static void main(String[] args){
    Scanner leitor = new Scanner(System.in);

    System.out.print("Digite o 1°número: ");
    float numero1 = leitor.nextFloat();

    System.out.print("Digite o 2°número: ");
    float numero2 = leitor.nextFloat();

    System.out.print("Digite o 2°número: ");
    float numero3 = leitor.nextFloat();

    double media =(numero1 + numero2 + numero3)/3;

    if (media >= 7){
        System.out.println("Aprovado");
    }else{
        System.out.println("Reprovado");
    }
    leitor.close();
}
}
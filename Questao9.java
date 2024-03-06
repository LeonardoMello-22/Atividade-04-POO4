import java.util.Scanner;

public class Questao9 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a altura: ");
        float altura = leitor.nextFloat();

        System.out.print("Digite o peso: ");
        float peso = leitor.nextFloat();

        float imc = peso / (altura * altura);

        System.out.println("IMC: " + imc);

        if (imc < 18.5) {
            System.out.println("Condição: Abaixo do peso");
        } else if (imc >= 18.5 && imc < 24.9) {
            System.out.println("Condição: Peso normal");
        } else if (imc >= 25 && imc < 29.9) {
            System.out.println("Condição: Sobrepeso");
        } else if (imc >= 30 && imc < 34.9) {
            System.out.println("Condição: Obesidade ");
        } else {
            System.out.println("Muito obeso");
        }

        leitor.close();
    }
}
import java.util.Scanner;

public class CalculadoraFatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro não negativo:");
        int numero = scanner.nextInt();

        int fat = 1; // Inicialize com 1, pois 0! = 1

        for (int i = 1; i <= numero; i++) {
            fat = fat * i;
        }

        System.out.println(numero + "! = " + fat);
    }
}
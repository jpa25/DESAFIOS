import java.util.Scanner;

public class ReversorString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite uma palavra:");
        String palavra = scanner.nextLine(); // Use nextLine() para ler uma string

        // Crie um StringBuilder para inverter a palavra
        StringBuilder palavraInvertida = new StringBuilder(palavra);
        palavraInvertida.reverse();

        System.out.println("A palavra invertida é: " + palavraInvertida);
    }
}
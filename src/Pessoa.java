import java.util.Scanner;

public class Pessoa {
    private String nome;
    private int idade;
    private String endereco;

    public Pessoa(String nome, int idade, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;

    }
    public void mostrarDetalhes(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Endereço: " + endereco);
    }
   
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite a sua idade:");
        int idade = scanner.nextInt();
        scanner.nextLine(); // Consuma a nova linha pendent

        /*Ao ler uma string (como nome, idade e endereço), você deve usar nextLine() em vez de nextInt(), porque nextInt() lê um número inteiro, não uma string.  */

        System.out.println("Digite o seu edereço");
        String endereco = scanner.nextLine();
    
        Pessoa pessoa = new Pessoa(nome, idade, endereco);
        pessoa.mostrarDetalhes();
    }
}

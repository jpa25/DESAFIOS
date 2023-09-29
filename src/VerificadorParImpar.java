import java.util.Scanner;

public class VerificadorParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para verificar se ele é par ou ímpar:");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) { 
            /*A razão pela qual usamos o operador `%` para calcular o resto da divisão por 2 e depois uma estrutura condicional `if` para determinar se o número é par ou ímpar é porque essa é uma abordagem comum para verificar a paridade de um número em programação.

Quando dividimos um número por 2, há duas possibilidades:

1. Se o resto da divisão for igual a 0, isso significa que o número é divisível por 2, o que indica que ele é par.
2. Se o resto da divisão for diferente de 0, isso significa que o número não é divisível por 2, o que indica que ele é ímpar.

A estrutura condicional `if` nos permite tomar uma decisão com base nesse resultado. Se o resto da divisão for igual a 0, executamos o bloco de código dentro do `if` para afirmar que o número é par. Caso contrário, executamos o bloco de código dentro do `else` para afirmar que o número é ímpar.

É uma abordagem simples e eficaz para determinar a paridade de um número em programação, e é amplamente utilizada em muitas linguagens de programação, incluindo Java. */
            System.out.println("O número " + numero + " é par.");
        } else {
            System.out.println("O número " + numero + " é ímpar.");
        }
    } 
}
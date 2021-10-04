package slides.slide01.num_08;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        //Exercicio 01 - Ler dois números inteiros e imprimir a soma
        Scanner teclado = new Scanner(System.in);

        //Entrada de Dados
        System.out.println("Informe um número: ");
        int num1 = teclado.nextInt();

        System.out.println("Informe o segundo número: ");
        int num2 = teclado.nextInt();

        int soma = num1 + num2;

        System.out.println("O resultado é:");
        System.out.println(soma);
    }
}

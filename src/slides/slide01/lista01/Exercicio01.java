package slides.slide01.lista01;

import java.util.Scanner;

//Q01 - Ler dois números inteiros e imprimir a soma
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1, num2, soma;

        System.out.println("Informe o primeiro Número");
        num1 = teclado.nextInt();

        System.out.println("Informe o segundo Número");
        num2 = teclado.nextInt();

        soma = num1 + num2;

        System.out.print("A soma é: " );
        System.out.println(soma);
    }
}

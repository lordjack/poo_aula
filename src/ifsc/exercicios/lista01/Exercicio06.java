package ifsc.exercicios.lista01;

import java.util.Scanner;

/*
Q06 - Escreva um algoritmo que pergunte o nome a altura (em metros) e a massa (em Kg) do usuário.
Em seguida, o programa deverá exibir uma mensagem dizendo o nome do usuário e a
sua densidade corporal
					Densidade = massa / metros
 */
public class Exercicio06 {
    public static void main(String[] args) {
        String nome;
        double altura, massa, densidade;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe um Nome");
        nome = teclado.nextLine();

        System.out.println("Informe uma altura");
        altura = teclado.nextDouble();

        System.out.println("Informe uma massa");
        massa = teclado.nextDouble();

        densidade = massa / altura;

        System.out.println("O nome é: " + nome);
        System.out.println("A densidade é: " + densidade + " parabéns!");
    }
}

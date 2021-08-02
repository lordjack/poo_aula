package ifsc.exercicios.lista01;

import java.util.Scanner;

//Q02 - Entrar com dois números inteiros e imprimir a média aritmética
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1, num2, media;

        System.out.println("Informe o primeiro Número");
        num1 = teclado.nextInt();

        System.out.println("Informe o segundo Número");
        num2 = teclado.nextInt();

        media = (num1 + num2) / 2;

        System.out.print("A média é: ");
        System.out.println(media);
    }
}

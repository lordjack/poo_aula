package slides.slide01.lista01;

import java.util.Scanner;

/*
Q05 - Elaborar um algoritmo para calcular e apresentar o volume de uma lata de óleo,
    utilizando a fórmula, utilize uma variável PI como constante:
	VOLUME = 3.14159 * (R*R) * ALTURA
 */
public class Exercicio05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double volume, raio, altura;

        System.out.println("Informe o raio");
        raio = teclado.nextDouble();

        System.out.println("Informe a altura");
        altura = teclado.nextDouble();

        volume = Math.PI * Math.pow(raio, 2) * altura;

        System.out.printf("O volume é: %.2f", volume);

    }
}

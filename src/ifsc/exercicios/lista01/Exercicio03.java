package ifsc.exercicios.lista01;

import java.util.Scanner;

//Q03 - Escreva um algoritmo que calcule o diâmetro, a área e a circunferência de um círculo,
// sabendo que o único dado disponível é o seu raio
//Diâmetro = 2 * Raio
//Área = Pi * Raio * Raio
//Circunferência= 2 * Pi * Raio
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double diametro, area, circunferencia, raio;
        double pi = 3.14;

        System.out.println("Informe um número para o raio");
        raio = teclado.nextDouble();

        diametro = 2 * raio;
        area = pi * raio * raio;
        circunferencia = 2 * pi * raio;

        System.out.printf("O Diametro é: %.2f \n", diametro);
        System.out.printf("A área é: %.2f \n", area);
        System.out.printf("A circunferencia é: %.2f \n", circunferencia);

    }
}

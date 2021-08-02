package ifsc.exercicios.lista01;

import java.util.Scanner;

/*
Crie um algoritmo que solicite e imprima os valores da diagonal maior,
 diagonal menor e calcule a área de um losango
	Fórmula: (diagonal maior * diagonal menor) dividido por 2

 */
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double diag_menor, diag_maior, area;

        System.out.println("Informe a diagonal menor");
        diag_menor = teclado.nextDouble();

        System.out.println("Informe a diagonal maior");
        diag_maior = teclado.nextDouble();

        area = (diag_maior * diag_menor) / 2;

        System.out.printf("O resultado é: %.2f", area);

    }
}

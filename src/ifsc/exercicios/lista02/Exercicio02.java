package ifsc.exercicios.lista02;

import java.util.Scanner;

/*
2.	Faça um programa que leia a distância em Km e a quantidade de litros de gasolina consumidos
por um carro em um percurso, calcule o consumo em Km=l e escreva uma mensagem de acordo com
a tabela abaixo:
        CONSUMO 	(Km/l) 	MENSAGEM
        menor que 	8	Venda o carro!
        entre 	8 e 14	Econômico!
        maior que 	14	Super econômico!
 */
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double distancia, qtd_litros, consumo;

        System.out.println("Informe a Distância Percorrida");
        distancia = teclado.nextDouble();

        System.out.println("Informe Quantidade de Litros");
        qtd_litros = teclado.nextDouble();

        consumo = distancia / qtd_litros;

        System.out.printf("O consumo é de: %.2f \n", consumo);
        if (consumo < 8) {
            System.out.println("Venda o carro!");
        } else if (consumo >= 8 && consumo <= 14) {
            System.out.println("Econômico!");
        } else if (consumo > 14) {
            System.out.println("Super econômico!");
        }

    }
}

package slides.slide02.lista02;

import java.util.Scanner;

/*
1.	Faça um programa em Java que leia a idade e o tempo de serviço de um trabalhador
 e escreva se ele pode ou não se aposentar. As condições para aposentadoria são:
•	Ter pelo menos 65 anos,
•	Ou ter trabalhado pelo menos 30 anos,
•	Ou ter pelo menos 60 anos e trabalhado pelo menos 25 anos.

 */
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int idade, anos_trabalho;

        System.out.println("Informe a idade do trabalhador");
        idade = teclado.nextInt();

        System.out.println("Informe tempo de serviço do trabalhador em anos");
        anos_trabalho = teclado.nextInt();

        if (idade >= 65) {
            System.out.println("Pode se aposentar sua idade é de: " + idade);
        } else if (anos_trabalho >= 30) {
            System.out.println("Pode se aposentar sua idade é de: " + idade + " Seu tempo de trabalho é: " + anos_trabalho);
        } else if (idade >= 60 && anos_trabalho >= 25) {
            System.out.println("Pode se aposentar sua idade é de: " + idade + " Seu tempo de trabalho é: " + anos_trabalho);
        } else {
            System.out.println("Não pode se aposentar pois não atendeu aos criterios exigidos. Sua idade é de: " + idade + " Seu tempo de trabalho é: " + anos_trabalho);
        }
    }
}

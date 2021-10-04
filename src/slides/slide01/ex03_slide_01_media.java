package slides.slide01;

import java.util.Scanner;

public class ex03_slide_01_media {

    public static void main(String[] args) {
        float n1, n2, media;

        Scanner leitor = new Scanner(System.in); //declaração do método de entrada de dados
        n1 = leitor.nextFloat(); //entrada de dados variavel N1
        n2 = leitor.nextFloat(); //entrada de dados variavel N2
        media = (n1 + n2) / 2; // processament - Calculo da média
        if (media >= 7) { // Teste condicional
            System.out.println("Aprovado"); //saída de dados se a condição for verdadeira
        } else {
            System.out.println("Reprovado"); //saída de dados se a condição for falsa
        }
    }
}

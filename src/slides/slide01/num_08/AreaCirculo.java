package slides.slide01.num_08;

import java.util.Scanner;

class AreaCirculo {
    public static void main(String[] args) {
        double area, raio;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o raio do círculo: ");

        raio = teclado.nextDouble();
        area = Math.PI * Math.pow(raio, 2);

        System.out.println("Área do círculo = " + area);
    }
}

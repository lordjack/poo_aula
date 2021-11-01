package slides.slide12;

import java.util.Random;
import java.util.Scanner;

public class MatrizExemplo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Random gerador = new Random(19700621);

        int matriz[][] = new int[3][3];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = gerador.nextInt(26);
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Matriz[" + i + "][" + j + "]: " + matriz[i][j]);
            }
        }
    }
}

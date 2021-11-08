package slides.slide13;

import java.util.ArrayList;
import java.util.Collections;

public class PricipalNomes {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<String>();

        nomes.add("Jackson");
        nomes.add("Ana");
        nomes.add("Maria");
        nomes.add("Chaves");

        System.out.println("Sem ordenação");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        Collections.sort(nomes);

        System.out.println("Com ordenação");
        for (String nome : nomes) {
            System.out.println(nome);
        }
/*
        System.out.println(nomes.contains("Ana"));

        nomes.remove("Ana");

        System.out.println(nomes.contains("Ana")); //verifica se Ana esta no array
        System.out.println("O tamanho é: " + nomes.size()); // retorna o tamanho do array
        System.out.println("Nome: " + nomes.get(1));// retorna o elemento na posição 2
*/
    }
}

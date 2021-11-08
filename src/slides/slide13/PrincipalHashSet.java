package slides.slide13;

import java.util.HashSet;

public class PrincipalHashSet {
    public static void main(String[] args) {
        HashSet<String> nomes = new HashSet<>();

        nomes.add("Jackson");
        nomes.add("Ana");
        nomes.add("Maria");
        nomes.add("Chaves");
        nomes.add("Jackson");

        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}

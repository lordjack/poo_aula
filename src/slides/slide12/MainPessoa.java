package slides.slide12;

import java.util.Scanner;

public class MainPessoa {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe a QTD de Pessoas");
        int qtdPessoas = leitor.nextInt();

        Pessoa pessoas[] = new Pessoa[qtdPessoas];

        for (Pessoa pessoa : pessoas) {
            pessoa.setNome(leitor.nextLine());
            pessoa.setIdade(leitor.nextInt());
        }

        for (Pessoa pessoa : pessoas) {
            pessoa.getNome();
            pessoa.getIdade();
        }

    }
}

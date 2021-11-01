package slides.slide12;

import java.util.Scanner;

public class MainPessoa {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe a QTD de Pessoas");
        int qtdPessoas = leitor.nextInt();

        Pessoa pessoas[] = new Pessoa[qtdPessoas];

        for (int i = 0; i < pessoas.length; i++) {
            Pessoa pessoa = new Pessoa();
            System.out.println("Informe um nome de uma pessoa");
            pessoa.setNome(leitor.next());
            System.out.println("Informe a idade de uma pessoa");
            pessoa.setIdade(leitor.nextInt());

            pessoas[i] = pessoa;
        }

        for (int i = 0; i < pessoas.length; i++) {
            System.out.println(pessoas[i].getNome());
            System.out.println(pessoas[i].getIdade());
        }

    }
}

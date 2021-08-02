import java.util.Scanner;  // importa a classe Scanner - Biblioteca

class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);  // cria um objeto Scanner
        System.out.println("Informe seu Nome:");

        String nome = leitor.nextLine();  // Lê a entrada do usuário
        System.out.println("Seu nome é: " + nome);  //Saída do usuário
    }
}

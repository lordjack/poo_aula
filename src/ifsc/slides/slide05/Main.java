package ifsc.slides.slide05;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();

        p1.setNome("Ana");
        p1.setIdade(27);
        p1.setPeso(56.5);

        System.out.println("Pessoa 01");
        System.out.println("O nome é: " + p1.getNome());
        System.out.println("A idade é: " + p1.getIdade());
        System.out.println("O peso é: " + p1.getPeso());

        Pessoa p2 = new Pessoa("Carlos", 18, 75);

        System.out.println("Pessoa 02");
        System.out.println("O nome é: " + p2.getNome());
        System.out.println("A idade é: " + p2.getIdade());
        System.out.println("O peso é: " + p2.getPeso());

        Pessoa p3 = new Pessoa("Lilian", 22, 60.8);

        System.out.println("Pessoa 03");
        System.out.println("O nome é: " + p3.getNome());
        System.out.println("A idade é: " + p3.getIdade());
        System.out.println("O peso é: " + p3.getPeso());
    }
}

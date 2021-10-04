package slides.slide05;

public class MainProfAluno {
    public static void main(String[] args) {
        Professor prof1 = new Professor("Jackson", 33, 1.75);

        System.out.println("Professor 01");
        System.out.println("O nome é: " + prof1.getNome());
        System.out.println("A idade é: " + prof1.getIdade());
        System.out.println("O altura é: " + prof1.getAltura());

        Aluno aluno1 = new Aluno("Pele",25,1.76);

        System.out.println("Aluno 01");
        System.out.println("O nome é: " + aluno1.getNome());
        System.out.println("A idade é: " + aluno1.getIdade());
        System.out.println("O altura é: " + aluno1.getAltura());

        Aluno aluno2 = new Aluno("Alisson",15,1.65);

        System.out.println("Aluno 02");
        System.out.println("O nome é: " + aluno2.getNome());
        System.out.println("A idade é: " + aluno2.getIdade());
        System.out.println("O altura é: " + aluno2.getAltura());

        Professor prof2 = new Professor("Alex", 32, 1.72);

        System.out.println("Professor 02");
        System.out.println("O nome é: " + prof2.getNome());
        System.out.println("A idade é: " + prof2.getIdade());
        System.out.println("O altura é: " + prof2.getAltura());

        Aluno aluno3 = new Aluno("Airton Senna",35,1.85);

        System.out.println("Aluno 03");
        System.out.println("O nome é: " + aluno3.getNome());
        System.out.println("A idade é: " + aluno3.getIdade());
        System.out.println("O altura é: " + aluno3.getAltura());

        Aluno aluno4 = new Aluno("Ronaldinho Gaucho",28,1.74);

        System.out.println("Aluno 04");
        System.out.println("O nome é: " + aluno4.getNome());
        System.out.println("A idade é: " + aluno4.getIdade());
        System.out.println("O altura é: " + aluno4.getAltura());

    }
}

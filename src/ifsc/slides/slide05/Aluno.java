package ifsc.slides.slide05;

public class Aluno {
    /*
        Utilizando a classe Pessoa descrita no exercício 02,
         crie as classes Aluno e Professor. Como são pessoas,
         tanto Aluno como Professor possuem os atributos nome,
          idade e altura. O construtor de ambas as classes deve
          receber todos os 3 atributos para sua instanciar a um objeto.
           E em seguida, crie uma classe main que instancia dois professores
           e quatro alunos. Diga qual o relacionamento entre Aluno e
            Professor.
     */

    String nome;
    int idade;
    double altura;

    public Aluno() {

    }

    public Aluno(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return this.altura;
    }
}

package ifsc.slides.slide05;

public class Pessoa {
    /*
        Defina uma classe denominada Pessoa que possua os
        atributos: nome, idade, peso. Em seguida, crie uma classe Main
        e instancie as pessoas: Ana, Carlos, Lílian. O construtor deve
         receber todos os 3 atributos para sua instanciar de um objeto.
         Por fim, apresente para o usuário os valores informados de
         todos os atributos.
     */

    String nome;
    int idade;
    double peso;

    public Pessoa() {

    }

    public Pessoa(String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
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

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return this.peso;
    }
}

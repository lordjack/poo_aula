package slides.slide08;

public class Pessoa {

    private int rg;
    private String nome;

    public Pessoa() {
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa(String nome, int rg) {
        this.nome = nome;
        this.rg = rg;
    }
}

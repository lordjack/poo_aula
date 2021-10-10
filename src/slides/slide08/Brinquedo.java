package slides.slide08;

public class Brinquedo {

    private double velocidade;
    private double aceleracao;
    private String nome;

    public Brinquedo() {
    }

    public Brinquedo(String nome) {
        this.nome = nome;
    }

    public Brinquedo(String nome, double velocidade, double aceleracao) {
        this.nome = nome;
        this.velocidade = velocidade;
        this.aceleracao = aceleracao;
    }

    // ...
    public void mover() {
        System.out.println("Mover Brinquedo");
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public double getAceleracao() {
        return aceleracao;
    }

    public void setAceleracao(double aceleracao) {
        this.aceleracao = aceleracao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}

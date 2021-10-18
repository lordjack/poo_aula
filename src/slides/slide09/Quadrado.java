package slides.slide09;

public class Quadrado implements FiguraGeometrica {
    private String nomeQuadrado;
    private int lado;

    public Quadrado(String nomeQuadrado, int lado) {
        this.nomeQuadrado = nomeQuadrado;
        this.lado = lado;
    }

    @Override
    public String getNomeFigura() {
        return this.nomeQuadrado;
    }

    @Override
    public int getArea() {
        return this.lado * this.lado;
    }

    @Override
    public int getPerimetro() {
        return this.lado * 4;
    }
}

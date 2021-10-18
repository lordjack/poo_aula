package slides.slide09;

public class Triangulo implements FiguraGeometrica {
    private String nomeTriangulo;
    private int ladoA;
    private int ladoB;
    private int ladoC;
    private int base;
    private int altura;

    public Triangulo(String nomeTriangulo, int ladoA, int ladoB, int ladoC, int base, int altura) {
        this.nomeTriangulo = nomeTriangulo;
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
        this.base = base;
        this.altura = altura;
    }

    @Override
    public String getNomeFigura() {
        return this.nomeTriangulo;
    }

    @Override
    public int getArea() {
        return (this.base * this.altura) / 2;
    }

    @Override
    public int getPerimetro() {
        return this.ladoA + this.ladoB + this.ladoC;
    }
}

package slides.slide09;

public class MainFiguraGeometrica {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado("ABC", 4);
        System.out.println(quadrado.getNomeFigura());
        System.out.println(quadrado.getPerimetro());
        System.out.println(quadrado.getArea());

        Triangulo triangulo = new Triangulo("ABCD", 10,10,3,5,10);
        System.out.println(triangulo.getNomeFigura());
        System.out.println(triangulo.getPerimetro());
        System.out.println(triangulo.getArea());
    }
}

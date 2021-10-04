package slides.slide03;

public class Principal {
    public static void main(String[] args) {
        Quadrado q1 = new Quadrado();

        q1.preencherEspaco(30,8);
        q1.informarCor("Vermelho");
        q1.informarMedida(20 * 10);

        q1.imprimirQuadrado();

        Quadrado q2 = new Quadrado();

        q2.preencherEspaco(18,10);
        q2.informarCor("Amarelo");
        q2.informarMedida(20 * 10);

        q2.imprimirQuadrado();
    }
}

package slides.slide08;

public class MainPrincipal {
    public static void main(String[] args) {
        Carro carro = new Carro();
        ControleRemoto controleRemoto = new ControleRemoto(carro);

        controleRemoto.mover();
    }
}

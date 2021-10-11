package slides.slide08;

public class MainControleRemoto {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setNome("Carro BMW");

        ControleRemoto controleRemoto1 = new ControleRemoto(carro);

        controleRemoto1.mover();

        Barco barco = new Barco();
        barco.setNome("Barco Titanic");

        ControleRemoto controleRemoto2 = new ControleRemoto(barco);

        controleRemoto2.mover();

        Aviao aviao = new Aviao();
        aviao.setNome("Avião A710");

        ControleRemoto controleRemoto3 = new ControleRemoto(aviao);

        controleRemoto3.mover();
    }
}

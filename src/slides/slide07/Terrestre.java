package slides.slide07;

public class Terrestre extends Transporte {
    private int numRodas;

    public Terrestre(int capacidade, int numRodas) {
        super(capacidade);
        this.numRodas = numRodas;
    }

    public int getNumRodas() {
        return numRodas;
    }

    public void setNumRodas(int numRodas) {
        this.numRodas = numRodas;
    }

    public int calcularNumPneusReserva() {
        return numRodas - 4;
    }
}

package ifsc.slides.slide06;

public class Motor {
    private double potencia;

    public Motor() {

    }

    public Motor(double potencia) {
        this.potencia = potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public double getPotencia() {
        return this.potencia;
    }
}

package ifsc.slides.slide06;

public class Automovel { //início

    private Motor motor;
    public Direcao direcao;

    public Automovel() {
        this.motor = new Motor();
        this.direcao = new Direcao();
    }

    public Automovel(double pontencia) {
        this.motor = new Motor(pontencia);
        this.direcao = new Direcao();
    }

    public void ligarPrimeiraVez() {
        this.motor = new Motor();
        this.direcao = new Direcao();
    }

    public void ligarPrimeiraVez(double pontencia) {
        this.motor = new Motor(pontencia);
        this.direcao = new Direcao();
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Motor getMotor() {
        return this.motor;
    }

    public void setDirecao(Direcao direcao) {
        this.direcao = direcao;
    }

    public Direcao getDirecao() {
        return this.direcao;
    }
}

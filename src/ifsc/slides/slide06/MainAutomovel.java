package ifsc.slides.slide06;

public class MainAutomovel {
    public static void main(String[] args) {
        Automovel automovel = new Automovel();

        //automovel.direcao.cor("preto");

        //-------- exemplo 02 --------
        automovel.ligarPrimeiraVez();

        //-------- exemplo 02 --------

        /*
        //-------- exemplo 03 --------
        Motor motor = new Motor();
        Direcao direcao = new Direcao();

        motor.setPotencia(1.6);
        direcao.setCor("preto");

        automovel.setMotor(motor);
        automovel.setDirecao(direcao);

        //-------- exemplo 03 --------
        */
        automovel.getDirecao().setCor("preto");
        automovel.getMotor().setPotencia(1.6);

        System.out.println("As caracteristicas do carro são: ");
        System.out.println("Potência: " + automovel.getMotor().getPotencia());
        System.out.println("Cor: " + automovel.getDirecao().getCor());
    }
}

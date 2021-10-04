package slides.slide07;

public class Principal {
    public static void main(String[] args) {
        Automovel automovel = new Automovel(500, 4, "Azul", 4, "MXP-0055");
        automovel.setCapacidade(600);
        automovel.setNumRodas(6);
        // automovel.capacidade = 1300; // não da erro, pois está declarada como protected!
        // automovel.numRodas = 6; // não da erro, pois está declarada como protected!

        automovel.imprimirDadosAutomovel();

        int n = automovel.calcularNumPneusReserva();
        System.out.println("O número de pneus reserva(s) é: " + n);

    }
}




/*

 */

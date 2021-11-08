package slides.slide09;

public class MainVeiculo {
    public static void main(String[] args) {
        Civic civic = new Civic();
        System.out.println("Tipo: " + civic.getTipo());
        System.out.println("Peso: " + civic.getPeso());
        System.out.println("Potencia: " + civic.getPotencia());
        System.out.println("RPM: " + civic.getRPM());
    }
}

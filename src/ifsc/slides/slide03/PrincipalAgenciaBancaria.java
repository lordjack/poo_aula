package ifsc.slides.slide03;

public class PrincipalAgenciaBancaria {
    public static void main(String[] args) {
        AgenciaBancaria ab1 = new AgenciaBancaria();

        ab1.setNome("Dieric");
        ab1.setCPF(00055500055);

        System.out.println("O nome é: " + ab1.getNome() + " e CPF: " + ab1.getCPF());

        System.out.println("O saldo é: " + ab1.consultarSaldo());

        ab1.depositar(500);

        System.out.println("O saldo é: " + ab1.consultarSaldo());

        ab1.sacar(300);

        System.out.println("O saldo é: " + ab1.consultarSaldo());

        /*
        AgenciaBancaria ab2 = new AgenciaBancaria();
        ab2.setSaldo(0);
        ab2.setNome("Fernanda");
        ab2.setCPF(1003330040);

        System.out.println("O nome é: " + ab2.getNome() + " e CPF: " + ab2.getCPF());

        System.out.println("O saldo é: " + ab2.consultarSaldo());

        ab1.depositar(1000);

        System.out.println("O saldo é: " + ab2.consultarSaldo());

        ab1.sacar(700);

        System.out.println("O saldo é: " + ab2.consultarSaldo());
*/
    }
}

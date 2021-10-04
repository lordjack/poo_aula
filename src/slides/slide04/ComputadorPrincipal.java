package slides.slide04;

public class ComputadorPrincipal {
    public static void main(String[] args) {
        Computador comp1 = new Computador();

        comp1.setModelo("Acer");
        comp1.setProcessador("Intel i7 2.6");
        comp1.setQtdMemoria(24);
        comp1.setDisco(500);

        System.out.println("Configurações do Computador são:");
        System.out.println("Modelo:" + comp1.getModelo());
        System.out.println("Processador:" + comp1.getProcessador());
        System.out.println("Memória:" + comp1.getQtdMemoria() + "GB");
        System.out.println("Armazenamento de Disco:" + comp1.getDisco() + "GB");

        Computador comp2 = new Computador();

        comp2.setModelo("Acer");
        comp2.setProcessador("Intel i7 3.2");
        comp2.setQtdMemoria(8);
        comp2.setDisco(1000);

        System.out.println("");
        System.out.println("Configurações do Computador são:");
        System.out.println("Modelo:" + comp2.getModelo());
        System.out.println("Processador:" + comp2.getProcessador());
        System.out.println("Memória:" + comp2.getQtdMemoria() + "GB");
        System.out.println("Armazenamento de Disco:" + comp2.getDisco() + "GB");

        Computador comp3 = new Computador();

        comp3.setModelo("Dell");
        comp3.setProcessador("Intel Pentil i7 N3700 1.6GHz");
        comp3.setQtdMemoria(80);
        comp3.setDisco(2000);

        System.out.println("");
        System.out.println("Configurações do Computador são:");
        System.out.println("Modelo:" + comp3.getModelo());
        System.out.println("Processador:" + comp3.getProcessador());
        System.out.println("Memória:" + comp3.getQtdMemoria() + "GB");
        System.out.println("Armazenamento de Disco:" + comp3.getDisco() + "GB");

    }
}

package slides.slide04;

public class Exemplos {
    public static void main(String[] args) {
        System.out.println("meu programa java");

        Carro meuCarro = new Carro();

        meuCarro.setCor("preto");
        meuCarro.setNumPortas(4);
        meuCarro.setPlaca("MHX-1234");
        meuCarro.setTipo("esportivo");

        System.out.println("cor: " + meuCarro.getCor());
        System.out.println("numero de portas: " + meuCarro.getNumPortas());
        System.out.println("placa: " + meuCarro.getPlaca());
        System.out.println("tipo: " + meuCarro.getTipo());
    }
}

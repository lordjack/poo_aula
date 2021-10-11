package slides.slide08;

public class MainBrinquedo {
    //atividade 02
    public static void main(String[] args) {
        Brinquedo brinquedo1 = new Brinquedo("Boneco");
        brinquedo1.setVelocidade(10);
        brinquedo1.setAceleracao(0.5);

        System.out.println("Nome: " + brinquedo1.getNome());
        System.out.println("Aceleração: " + brinquedo1.getAceleracao());
        System.out.println("Velocidade: " + brinquedo1.getVelocidade());

        Brinquedo brinquedo2 = new Brinquedo();
        brinquedo2.setNome("Carrinho");
        brinquedo2.setVelocidade(70.4);
        brinquedo2.setAceleracao(2.5);

        System.out.println("Nome: " + brinquedo2.getNome());
        System.out.println("Aceleração: " + brinquedo2.getAceleracao());
        System.out.println("Velocidade: " + brinquedo2.getVelocidade());

        Brinquedo brinquedo3 = new Brinquedo("Caminhão");
        brinquedo3.setVelocidade(70.4, 1.8);

        System.out.println("Nome: " + brinquedo3.getNome());
        System.out.println("Aceleração: " + brinquedo3.getAceleracao());
        System.out.println("Velocidade: " + brinquedo3.getVelocidade());
    }
}

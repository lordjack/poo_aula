package slides.slide08;

public class ControleRemoto {
    private Brinquedo brinquedo;

    public ControleRemoto(Brinquedo b) {
        this.brinquedo = b;
    }

    public void mover() {
        System.out.print(this.brinquedo.getNome() + ": ");
        this.brinquedo.mover();
    }
}

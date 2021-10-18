package slides.slide10;

public class TesteFuncaoExcecoes {
    public static void main(String[] args) {
        try {
            Funcoes funcoes = new Funcoes();

            int x = funcoes.lancaExcecao(5, 0);
            //faça alguma coisa!
            System.out.println(x);
        } catch (Exception e) {
            //tente se recuperar!
            System.out.println(e.getMessage());
        }
        System.out.println("Continua a execução...");
    }
}

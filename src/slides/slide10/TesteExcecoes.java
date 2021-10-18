package slides.slide10;

public class TesteExcecoes {
    public static void main(String[] args) {
        try {
            int x = 1 / 0;
            System.out.println(x);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Continua a execução...");

        /*
        try {
            ligarFogao();
            fogao.assar();
        } catch (FogaoExcecao ex) {
            ex.printStackTrace();
        } finally {
            desligarFogao();
        }
*/
    }
}




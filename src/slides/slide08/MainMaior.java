package slides.slide08;

public class MainMaior {
    public static void main(String[] args) {
        Maior maior = new Maior();
        int x = 2;
        int y = 2;
        float z = maior.calcMaior(x, y);

        System.out.println("O maior é: " + z);
    }
}

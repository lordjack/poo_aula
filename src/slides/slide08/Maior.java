package slides.slide08;

public class Maior {

    private int xInt;
    private int yInt;
    private float xFloat;
    private float yFloat;
    private double xDouble;
    private double yDouble;

    public Maior() {

    }
    public Maior(int xInt, int yInt, float xFloat, float yFloat, double xDouble, double yDouble) {
        this.xInt = xInt;
        this.yInt = yInt;
        this.xFloat = xFloat;
        this.yFloat = yFloat;
        this.xDouble = xDouble;
        this.yDouble = yDouble;
    }

    public int calcMaior(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }

    public float calcMaior(float x, float y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }

    public double calcMaior(double x, double y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }

    }

    public double calcMaior(double a, double b, double c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else {
            return c;
        }
    }

    //  public double calcMaior(double x, double y) { ...} // erro!
}

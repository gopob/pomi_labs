package lab_03_02;

public class RightTriangle extends Triangle implements Area {
    private int b;
    public RightTriangle() {}
    public RightTriangle(int a, int b) {
        super(a);
        this.b = b;
    }
    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }
    public void area() {
        double s = (getA() * b) / 2;
        System.out.println("Площадь прямоугольного треугольника: " + s);
    }
}
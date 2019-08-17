package lab_03_02;

public class Circle implements Area {
    public int r;
    public Circle() {}
    public Circle(int r) {
        this.r = r;
    }
    public void area() {
        double s = 3.14 * r * r;
        System.out.printf("Площадь круга: %.4f\n",s);
    }

}
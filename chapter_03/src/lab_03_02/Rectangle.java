package lab_03_02;

public class Rectangle implements Area {
    public int a, b;
    public Rectangle() {
    }
    public Rectangle(int a,int b) {
        this.a = a;
        this.b = b;
    }
    public void area() {
        int s = a * b;
        System.out.println("Площадь прямоугольника: " + s);
    }

}
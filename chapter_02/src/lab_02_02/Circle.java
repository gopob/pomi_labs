package lab_02_02;

public class Circle {
    public int r, x, y;
    public Circle() {}
    public Circle(int r) {
        this.r = r;
    }
    public Circle(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Circle(int r, int x, int y) {
        this.r = r;
        this.x = x;
        this.y = y;
    }
    public void show() {
        System.out.println("Радиус = " + r + ", Координата по х = " + x + " Координата по у = " + y);
    }
    public int showCentre(int a, int b) {
        x += a;
        y += b;
        return x;
    }
    public int showRadius(int c) {
        r += c;
        return r;
    }
    public void S() {
        double s = Math.PI * r;
        System.out.println("Площадь круга равна = " + s);
    }
    public void L() {
        double l = 2 * Math.PI * r;
        System.out.println("Длина окружности равна = " + l);
    }
}
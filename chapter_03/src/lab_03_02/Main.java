package lab_03_02;



public class Main {
    public static void main(String[] args) {
        Area r = new Rectangle(2, 3);
        Area c = new Circle(3);
        Area rt = new RightTriangle(6, 3);
        Area t = new Trapeze(1, 2, 3);
        r.area();
        c.area();
        rt.area();
        t.area();
    }
}
package lab_02_06;

public class Main {
    public static void main(String[] args) {
        Vector ob1 = new Vector(1, 1, 4);
        Vector ob2 = new Vector(1, 1, 3);
        Vector.sumV(ob1, ob2);
        Vector.difV(ob1, ob2);
        Vector.multV(ob1, ob2);
        Vector.inc(ob1);
        Vector.dec(ob1);
        Vector arr[] = Vector.createArr(2, ob1, ob2);
        Vector.showArr(arr);
        Vector.corner(arr);
    }
}
package lab_02_02;

public class Main {
    public static void main ( String[] args ){
        Circle ob = new Circle(1,2,3);
        ob.show();

        int time1 = ob.showCentre(2,3);
        System.out.println("Изменённая координа х: " + ob.x);
        System.out.println("Изменённая координа у: " + ob.y);

        int time2 = ob.showRadius(2);
        System.out.println("Изменённый радиус: " + ob.r);
        ob.S();
        ob.L();
    }
}
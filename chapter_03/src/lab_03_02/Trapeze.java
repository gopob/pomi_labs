package lab_03_02;

public class Trapeze implements Area{
    public int a,b,h;
    public Trapeze() {
    }
    public Trapeze(int a,int b,int h) {
        this.a=a;
        this.b=b;
        this.h=h;
    }
    public void area() {
        double s=((a+b)*h)/2;
        System.out.println("Площадь трапеции: "+s);
    }

}
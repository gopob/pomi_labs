package lab_03_02;
public abstract class Triangle implements Area {
    private int a,h;
    public Triangle() {
    }
    public Triangle(int a,int h) {
        this.a=a;
        this.h=h;
    }
    public Triangle(int a) {
        this.a=a;
    }
    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
    public int getH() {
        return h;
    }
    public void setH(int h) {
        this.h = h;
    }
    public abstract void area();
}
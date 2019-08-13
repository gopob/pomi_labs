package lab_03_03;

public class ComplexNumber implements Norm{
    public int a,b;
    public ComplexNumber() {
    }
    public ComplexNumber(int a,int b) {
        this.a=a;
        this.b=b;
    }
    public void norm() {
        double n=Math.pow(2, Math.abs(a+b));
        System.out.println("Норма комплексного числа: "+n);
    }

}
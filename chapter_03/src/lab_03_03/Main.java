package lab_03_03;

public class Main {
    public static void main(String[] args) {
        Norm cn = new ComplexNumber(2,3);
        cn.norm();
        Norm v = new Vector(Vector.createArr());
        v.norm();
        Norm m = new Matrix();
        m.norm();
    }
}


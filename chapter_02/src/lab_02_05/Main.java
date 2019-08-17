package lab_02_05;

public class Main {
    public static void main(String[] args) {
        Fraction dr1 = new Fraction(6, 8);
        Fraction dr2 = new Fraction(3, 4);
        Fraction dr3 = new Fraction(6, 8);
        Fraction.sum(dr1, dr2);
        Fraction.dif(dr1, dr2);
        Fraction.mult(dr1, dr2);
        Fraction.div(dr1, dr2);
        Fraction.red(dr1);
        Fraction mas[] = Fraction.createMas(4);
        Fraction.showMas(mas);
        Fraction arr[] = Fraction.createArr(3, dr1, dr2, dr3);
        Fraction.showArr(arr);
        Fraction.change(arr);
    }
}
package lab_03_01;


public class Main {
    public static void main(String[] args) {
        Matrix matrix=new Matrix();
        Matrix.createMas();
        Matrix.createArr();
        Matrix.showElement(Matrix.createArr());
        Matrix.scaling(Matrix.createArr());
        matrix.comparison();
        matrix.sum();

        Line lines=new Line();
        Line.createArr();
        Line.showOneElement(Line.createArr());
        lines.comparison();
        lines.sum();

        Vector vector=new Vector();
        Vector.createArr();
        Vector v1=new Vector(Vector.createArr());
        Vector v2=new Vector(Vector.createArr());
        Vector.comparisonLength(v1, v2);
        vector.sum();
        vector.comparison();
    }
}

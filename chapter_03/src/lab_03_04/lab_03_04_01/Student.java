package lab_03_04.lab_03_04_01;

public abstract class Student implements Abiturient{
    private static String s;
    public Student() {
    }
    public Student(String s) {
        this.s=s;
    }
    public String getS() {
        return s;
    }
    public void setS(String s) {
        this.s = s;
    }
    public static String string() {
        s="Ходит в универ";
        return s;
    }
    public abstract void goToClasses();
}

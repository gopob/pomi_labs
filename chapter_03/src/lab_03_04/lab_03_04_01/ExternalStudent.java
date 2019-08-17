package lab_03_04.lab_03_04_01;

public class ExternalStudent extends Student implements Abiturient {
    private int day;
    public ExternalStudent() {}
    public ExternalStudent(String s, int day) {
        super(s);
        this.day = day;
    }
    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }
    public void goToClasses() {
        System.out.println(getS() + " " + day + " дней");
    }

}
package lab_03_04.lab_03_04_02;

public class Main {
    public static void main(String[] args) {
        Employee employee1=new Engineer(8);
        Employee employee2=new Boss(6,"влаовоавло");
        employee1.howmuch();
        employee2.howmuch();
    }
}

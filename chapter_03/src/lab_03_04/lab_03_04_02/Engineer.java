package lab_03_04.lab_03_04_02;

public class Engineer implements Employee{
    public int clock;
    public Engineer() {
    }
    public Engineer(int clock) {
        this.clock=clock;
    }
    public void howmuch() {
        System.out.println("Работает "+clock+" часов в день");
    }
}
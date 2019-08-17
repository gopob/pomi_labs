package lab_03_04.lab_03_04_02;

public class Boss extends Engineer{
    public String s;
    public Boss() {
    }
    public Boss(int clock,String s) {
        super(clock);
        this.s = s;
    }
    public void howmuch() {
        super.howmuch();
        System.out.print("И "+s);
    }

}
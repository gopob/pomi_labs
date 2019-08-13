package lab_03_04.lab_03_04_06;

public abstract class Player implements Technic{
    public int volume;
    public Player() {
    }
    public Player(int volume) {
        this.volume=volume;
    }
    public abstract void show();
}

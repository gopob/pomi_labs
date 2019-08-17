package lab_03_04.lab_03_04_04;

public abstract class WarShip implements Ship {
    public int mast, gun;
    public WarShip() {}
    public WarShip(int mast, int gun) {
        this.mast = mast;
        this.gun = gun;
    }
    public abstract void weapon();
}
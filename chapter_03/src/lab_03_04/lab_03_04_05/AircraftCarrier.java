package lab_03_04.lab_03_04_05;

public class AircraftCarrier extends WarShip implements Ship{
    public int plane;
    public AircraftCarrier() {
        super();
    }
    public AircraftCarrier(int mast,int gun,int plane) {
        super(mast,gun);
        this.plane=plane;
    }
    public void weapon() {
        System.out.println("Количество матч: "+mast+", количество пушек: "+gun+", количество самолётов: "+plane);
    }

}
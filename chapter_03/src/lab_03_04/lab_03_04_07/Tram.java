package lab_03_04.lab_03_04_07;

public class Tram extends PublicTransport implements TransportVehicle {
    public int speed;
    public Tram() {
        super();
    }
    public Tram(int people, String place, int speed) {
        super(people, place);
        this.speed = speed;
    }
    public void show() {
        System.out.println("Трамвай");
    }
    public void characteristic() {
        System.out.println("Количество мест: до " + people + ", места: " + place + ", скорость: " + speed);
    }

}
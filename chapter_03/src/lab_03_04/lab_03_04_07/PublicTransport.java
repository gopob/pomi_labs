package lab_03_04.lab_03_04_07;

public abstract class PublicTransport implements TransportVehicle {
    public int people;
    public String place;
    public PublicTransport() {}
    public PublicTransport(int people, String place) {
        this.people = people;
        this.place = place;
    }
    public abstract void show();
    public abstract void characteristic();
}
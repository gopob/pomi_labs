package lab_03_04.lab_03_04_05;




public class Main {
    public static void main(String[] args) {
        Carrier ship = new Carrier(1, Carrier.createArr());
        Tanker ship1 = new Tanker(2, Carrier.createArr(), 200);
        Carrier m;
        m = ship;
        m.cargo();
        m = ship1;
        m.cargo();
    }
}
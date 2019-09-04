package lab_02_01.lab_02_01_04;

import java.util.Scanner;
public class House {
    private int id, number, floor, room, term;
    private double area;
    private String street, type;

    public House() {}
    public House(int id, int number, double area, int floor, int room, String street, String type, int term) {
        this.id = id;
        this.number = number;
        this.area = area;
        this.floor = floor;
        this.room = room;
        this.street = street;
        this.type = type;
        this.term = term;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public int getFloor() {
        return floor;
    }
    public void setFloor(int floor) {
        this.floor = floor;
    }
    public int getRoom() {
        return room;
    }
    public void setRoom(int room) {
        this.room = room;
    }
    public int getTerm() {
        return term;
    }
    public void setTerm(int term) {
        this.term = term;
    }
    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    @Override
    public String toString() {
        return "House [id=" + id + ", number=" + number + ", floor=" + floor + ", room=" + room + ", term=" + term +
                ", area=" + area + ", street=" + street + ", type=" + type + "]";
    }

    public void show() {
        System.out.println("id: " + this.id + ", number: " + number + ", area: " + area + ", floor: " + floor + ", rooms: " + room + ", street: " + street + ", type: " + type + ", term: " + term);
    }
    public static House[] createMas(int n) {
        House arr[] = new House[n];
        arr[0] = new House(1, 11, 111, 1, 1, "Example", "123", 1);
        arr[1] = new House(2, 22, 222, 2, 2, "Example", "123", 2);
        arr[2] = new House(3, 33, 333, 3, 3, "Example", "123", 3);
        return arr;
    }
    public static void showMas(House[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i].show();
        }
        System.out.println();
    }
    public static void spisA(House[] arr) {
        int a, b = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число комнат: ");
        if (sc.hasNextInt()) {
            a = sc.nextInt();

            for (int i = 0; i < arr.length; i++) {
                if (arr[i].getRoom() == a) {
                    arr[i].show();
                    b++;
                }
            }
        }
        if (b == 0) {
            System.out.println("Квартир с ведёнными параметрами нет");
        }
        System.out.println();
    }

    public static void spisB(House[] arr) {
        int a, d = 0;
        double b, c;
        Scanner s = new Scanner(System.in);
        System.out.print("Введите число комнат: ");
        if (s.hasNextInt()) {
            a = s.nextInt();
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите начальный этаж: ");
            if (sc.hasNextDouble()) {
                b = sc.nextDouble();
                Scanner scc = new Scanner(System.in);
                System.out.print("Введите конечный этаж: ");
                if (scc.hasNextDouble()) {
                    c = scc.nextDouble();

                    for (int i = 0; i < arr.length; i++) {
                        if (arr[i].getRoom() == a && arr[i].getFloor() >= b && arr[i].getFloor() <= c) {
                            arr[i].show();
                            d++;
                        }
                    }
                }
            }
        }
        if (d == 0) {
            System.out.println("Квартир с ведёнными параметрами нет");
        }
        System.out.println();
    }

    public static void spisC(House[] arr) {
        double a;
        int b = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите площадь: ");
        if (sc.hasNextDouble()) {
            a = sc.nextDouble();

            for (int i = 0; i < arr.length; i++) {
                if (a < arr[i].area) {
                    arr[i].show();
                    b++;
                }
            }
        }
        if (b == 0) {
            System.out.println("Квартир с ведёнными параметрами нет");
        }
        System.out.println();
    }

}
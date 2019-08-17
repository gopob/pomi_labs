package lab_02_01.lab_02_01_02;

import java.util.Scanner;
public class Patient {
    private int id, number;
    private String name, lastName, middleName, address, phone, diagnosis;

    public Patient() {}
    public Patient(int id, String lastName, String name, String middleName, String address, String phone, int number, String diagnosis) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.middleName = middleName;
        this.address = address;
        this.phone = phone;
        this.number = number;
        this.diagnosis = diagnosis;
    }

    @Override
    public String toString() {
        return "Patient [id=" + id + ", number=" + number + ", name=" + name + ", lastName=" + lastName + ", middleName=" + middleName + ", address=" +
                address + ", phone=" + phone + ", diagnosis=" + diagnosis + "]";
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getMiddleName() {
        return middleName;
    }
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public String getDiagnosis() {
        return diagnosis;
    }
    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
    public void show() {
        System.out.println("id: " + this.id + ", lastName: " + this.lastName + ", name: " + this.name + ", middleName:" + this.middleName + ", address:" + this.address + ", phone:" + this.phone + ", number: " + number + ", diagnosis: " + diagnosis);
    }
    public static Patient[] createArr(int n) {
        Patient arr[] = new Patient[n];
        arr[0] = new Patient(1, "Petrov", "Petr", "Petrovich", "Petrovskaya 22/1", "222222", 663101, "Лейкимия");
        arr[1] = new Patient(2, "Ivanov", "Ivan", "Ivanovich", "Ivanovskaya 11/1", "111111", 563101, "Пневмания");
        return arr;
    }
    public static void showArr(Patient[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i].show();
        }
        System.out.println();
    }
    public static void spisA(Patient[] arr) {
        String a = "";
        int b = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите диагноз: ");
        if (sc.hasNextLine()) {
            a = sc.nextLine();

            for (int i = 0; i < arr.length; i++) {
                if (a.equals(arr[i].getDiagnosis())) {
                    arr[i].show();
                    b++;
                }
            }
        }
        if (b == 0) {
            System.out.println("Больных с данным диагнозом нет");
        }
        System.out.println();
    }
    public static void spisB(Patient[] arr) {
        int a, b, c = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите начальное значение: ");
        if (sc.hasNextInt()) {
            a = sc.nextInt();
            Scanner scc = new Scanner(System.in);
            System.out.print("Введите конечное значение: ");
            if (scc.hasNextInt()) {
                b = scc.nextInt();

                for (int i = 0; i < arr.length; i++) {
                    if (arr[i].getNumber() > a && arr[i].getNumber() < b) {
                        arr[i].show();
                        c++;
                    }
                }
            }
        }
        if (c == 0) {
            System.out.println("Больных с ведённым номером медицинской карты нет");
        }
        System.out.println();
    }
}
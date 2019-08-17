package lab_02_01.lab_02_01_03;

import java.util.Arrays;


public class Abiturient {
    private int id;
    private String lastName;
    private String name;
    private String middleName;
    private String address;
    private int number;
    int[] marks;

    public Abiturient() {


    }

    public Abiturient(int id, String lastName, String name, String middleName, String address, int number, int[] marks) {
        this.id = id;
        this.lastName = lastName;
        this.name = name;
        this.middleName = middleName;
        this.address = address;
        this.number = number;
        this.marks = marks;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setLatName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public int[] getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Abiturient [id=" + id + ", lastName=" + lastName + ", name=" + name + ", middleName=" + middleName + ", address=" +
                address + ", number=" + number + ", marks=" + Arrays.toString(marks) + "]";
    }

    public void badStudent() {
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < 2) {
                System.out.println("name: " + this.getName());
            }
        }
    }

    public void srBall(int a) {
        int sr_ball = 0;
        for (int i = 0; i < marks.length; i++) {
            sr_ball += marks[i];
        }
        sr_ball = sr_ball / marks.length;
        if (sr_ball >= a) {
            System.out.println("SR_ball is higher that: " + a);
            System.out.println("Name: " + this.getName());
        }
    }
}

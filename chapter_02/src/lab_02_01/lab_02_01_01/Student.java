package lab_02_01.lab_02_01_01;

import java.util.Scanner;

public class Student {
    private int id, group, course, date;
    private String name, lastName, middleName, address, phone, faculty;

    public Student() {
    }

    public Student(int id, String name, String lastName, String middleName, int date, String address, String phone, String faculty, int course, int group) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.group = group;
        this.course = course;
        this.middleName = middleName;
        this.date = date;
        this.address = address;
        this.phone = phone;
        this.faculty = faculty;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getGroup() {
        return group;
    }
    public void setGroup(int group) {
        this.group = group;
    }
    public int getCourse() {
        return course;
    }
    public void setCourse(int course) {
        this.course = course;
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
    public int getDate() {
        return date;
    }
    public void setDate(int date) {
        this.date = date;
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
    public String getFaculty() {
        return faculty;
    }
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
    @Override
    public String toString() {
        return "Student [Id = " + id + ", Group = " + group + ", Course = " + course + ", Name = " + name + ", Last Name = " + lastName + ", Middle Name = " + middleName
                + ", Date = " + date + ", Address = " + address + ", Phone = " + phone + ", Faculty = " + faculty + "]";
    }

    public void show() {
        System.out.println("id: "+this.id+", name: "+this.name+", lastName: "+this.lastName+", middleName:"+this.middleName+ ", date:"+this.date+", address:"+this.address+", phone:"+this.phone+", faculty:"+this.faculty+", course:"+this.course+", group:"+this.group);
    }
    public static Student[] createArr(int n) {
        Student arr[] = new Student[n];

        arr[0]=new Student(1,"Petr","Petrov","Petrovich",1998,"Example 22/1","123456","FIC",3,763102);
        arr[1]=new Student(2,"Ivan","Ivanov","Ivanovich",1997,"Example 11/1","123212","FTK",4,763101);
        arr[2]=new Student(3,"Alex","Albon","",2000,"Example 22/1","3322123","FTK",3,763101);

        return arr;
    }
    public static void showMas(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i].show();
        }
        System.out.println();
    }

    public static void spisA(Student[] arr) {
        String a = "";
        int b = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите нужный факультет: ");
        if (sc.hasNextLine()) {
            a = sc.nextLine();
            a = a.toUpperCase();
        }
        for(int i = 0; i < arr.length; i++) {
            if(a.equals(arr[i].getFaculty())) {
                arr[i].show();
                b++;
            }
        }
        if(b == 0) {
            System.out.println("Студентов в данном факультете не числиться");
        }
        System.out.println();
    }

    public static void spicB(Student[] arr) {
        int b = 0;
        for(int j = 1; j <= 4; j++) {
            System.out.println(j + " курс");
            for(int i = 0; i < arr.length; i++) {
                if(arr[i].getCourse() == j) {
                    if(arr[i].getFaculty() == "FIC") {
                        arr[i].show();
                        b++;
                    }
                    else {
                        if(arr[i].getFaculty() == "FTK") {
                            arr[i].show();
                            b++;
                        }
                    }
                }
                else if(arr[i].getCourse() == j) {
                    if(arr[i].getFaculty() == "FIC") {
                        arr[i].show();
                        b++;
                    }
                    else {
                        if(arr[i].getFaculty() == "FTK") {
                            arr[i].show();
                            b++;
                        }
                    }
                }
                else if(arr[i].getCourse() == j) {
                    if(arr[i].getFaculty() == "FIC") {
                        arr[i].show();
                        b++;
                    }
                    else {
                        if(arr[i].getFaculty() == "FTK") {
                            arr[i].show();
                            b++;
                        }
                    }
                }
                else if(arr[i].getCourse() == j) {
                    if(arr[i].getFaculty() == "FIC") {
                        arr[i].show();
                        b++;
                    }
                    else {
                        if(arr[i].getFaculty()  == "FTK") {
                            arr[i].show();
                            b++;
                        }
                    }
                }
            }
            if(b == 0) {
                System.out.println("Студентов на данном курсе нет");
            }
        }
        System.out.println();
    }

    public static void spicC(Student[] arr) {
        int a, b = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите дату рождения: ");
        if (sc.hasNextInt()) {
            a = sc.nextInt();
            for(int i = 0; i < arr.length; i++) {
                if(arr[i].getDate() > a) {
                    arr[i].show();
                    b++;
                }
            }
            if(b == 0)
                System.out.println("Студентов, родившихся после заданного года, нет");
        }
    }

    public static void spicD(Student[] arr) {
        int a, b = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите нужную группу: ");
        if (sc.hasNextInt()) {
            a = sc.nextInt();
            for(int i = 0; i < arr.length; i++) {
                if(arr[i].getGroup() == a) {
                    arr[i].show();
                    b++;
                }
            }
            if(b == 0)
                System.out.println("Студентов в данной группе нет");
        }
    }
}
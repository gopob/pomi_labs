package lab_02_01.lab_02_01_03;

import java.util.Arrays;

public class Student {
    private int id;
    private String surName;
    private String name;
    private String middleName;
    private String address;
    private String phone;
    private int[] rating;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public void setAdress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int [] getRating() {
        return rating;
    }

    public void setRating(int rating []) {
        this.rating = rating;
    }

    private String printArry(int [] rating){
        String str="";
        for(int i: rating){
            str+=i+" ";
        }
        return str;
    }

    public void printInfo(){
        System.out.println(id+" "+surName+" "+name+" "+middleName+" "+address+" "+phone+" "+printArry(rating));
    }

    public int avg(int [] rating){
        int result=0;
        for(int i: rating){
            result+=i;
        }
        return result/rating.length;
    }

    public Student(int id, String surName, String name, String middleName,
                   String address, String phone, int [] rating) {
        super();
        this.id = id;
        this.surName = surName;
        this.name = name;
        this.middleName = middleName;
        this.address = address;
        this.phone = phone;
        this.rating = rating;
    }


}
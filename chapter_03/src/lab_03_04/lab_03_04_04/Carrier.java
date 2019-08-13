package lab_03_04.lab_03_04_04;

import java.util.Arrays;

public class Carrier implements Ship{
    private int number;
    private String[] arr;
    public Carrier() {
    }
    public Carrier(int number,String[] arr) {
        this.number=number;
        this.arr=arr;
    }
    public Carrier(Carrier ob) {
        this.number=ob.number;
        this.arr=ob.arr;
    }
    public String[] getArr() {
        return arr;
    }
    public void setArr(String[] arr) {
        this.arr = arr;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }


    @Override
    public String toString() {
        return Arrays.toString(arr) ;
    }
    public static String[] createArr() {
        String[] arr=new String[4];
        arr[0]="Table";
        arr[1]="Computer";
        arr[2]="Apples";
        arr[3]="Boll";
        return arr;
    }
    public static String[] showArr(String[] arr) {
        System.out.print("[");
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+",");
        }
        System.out.print("]");
        return arr;
    }
    public void cargo() {
        Carrier ob=new Carrier(1,Carrier.createArr());
        System.out.println("Номер груза: "+number+"; "+ob.toString());
    }

}
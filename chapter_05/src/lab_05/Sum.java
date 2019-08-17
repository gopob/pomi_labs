package lab_05;

import java.util.*;
public class Sum {
    public int number;
    public Sum() {}
    public Sum(int number) {
        this.number = number;
    }
    @Override
    public String toString() {
        return number + "";
    }
    public static ArrayList < Sum > sum(ArrayList < Sum > arr) {
        ArrayList < Sum > mas = new ArrayList < Sum > ();
        if (arr.size() != 1) {
            if (arr.size() % 2 == 0) {
                for (int i = 0; i < arr.size(); i += 2) {
                    Sum ob = new Sum(arr.get(i).number + arr.get(i + 1).number);
                    mas.add(ob);
                }
            } else {
                for (int i = 0; i < arr.size() - 1; i += 2) {
                    Sum ob = new Sum(arr.get(i).number + arr.get(i + 1).number);
                    mas.add(ob);
                }
                Sum ob = new Sum();
                ob.number = arr.get(arr.size() - 1).number;
                mas.add(ob);
            }
            return sum(mas);
        } else {
            return arr;
        }
    }
    public static void main(String[] args) {
        ArrayList < Sum > arr = new ArrayList < Sum > ();
        arr.add(new Sum(1));
        arr.add(new Sum(2));
        arr.add(new Sum(3));
        arr.add(new Sum(4));
        arr.add(new Sum(5));
        arr.add(new Sum(6));
        try {
            System.out.println(sum(arr));
        } catch (StackOverflowError e) {
            System.out.println("Пустой массив");
        }
    }
}
package lab_05;

import java.util.*;
public class CircleNumber {
    public int number;
    public CircleNumber() {
    }
    public CircleNumber(int number) {
        this.number=number;
    }
    @Override
    public String toString() {
        return "CircleNumber [number=" + number + "]";
    }
    public static void circle(ArrayList<CircleNumber> arr) {
        System.out.println("Начальный размер массива: "+arr.size());
        while(arr.size()!=1) {
            for(int i=0;i<arr.size();i++) {
                for(int j=0;j<arr.size();j+=2) {
                    arr.remove(j);
                }
            }
        }
        Iterator<CircleNumber> itr = arr.iterator();
        while (itr.hasNext()) {
            CircleNumber element = itr.next();
            System.out.println(element.toString());
        }
    }


    public static void circle(LinkedList<Integer> arr) {
        while(arr.size()!=1) {
            for(int i=0;i<arr.size();i++) {
                arr.removeFirst();
                Integer ob=arr.pollFirst();
                arr.addLast(ob);
            }
        }
        Iterator<Integer> itr = arr.iterator();
        while (itr.hasNext()) {
            Integer element = itr.next();
            System.out.println(element.toString());
        }
    }

    public static void main(String[] args) {
        ArrayList<CircleNumber> arr=new ArrayList<CircleNumber>();
        LinkedList<Integer> mas=new LinkedList<Integer>();
        arr.add(new CircleNumber(1));
        arr.add(new CircleNumber(2));
        arr.add(new CircleNumber(3));
        arr.add(new CircleNumber(4));
        arr.add(new CircleNumber(5));
        arr.add(new CircleNumber(6));
        arr.add(new CircleNumber(7));
        arr.add(new CircleNumber(8));
        arr.add(new CircleNumber(9));

        mas.add(1);
        mas.add(2);
        mas.add(3);
        mas.add(4);
        mas.add(5);
        mas.add(6);
        mas.add(7);
        mas.add(8);
        mas.add(9);
//circle(arr);
        circle(mas);
    }
}
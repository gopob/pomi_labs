package lab_03_01;

import java.util.Scanner;
public class Vector {
    public int arr[];
    public Vector() {
    }
    public Vector(int arr[]) {
        this.arr=arr;
    }

    public static int[] createArr() {
        System.out.println("Введите первую координату: ");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();

        System.out.println("Введите вторую координату: ");
        Scanner scc=new Scanner(System.in);
        int y=scc.nextInt();

        int[] arr=new int[2];
        arr[0]=x;
        arr[1]=y;
        System.out.println("Вектор х=("+arr[0]+";"+arr[1]+")");
        return arr;

    }
    public static void comparisonLength(Vector ob1,Vector ob2) {
        double l1=Math.sqrt(Math.pow(2, ob1.arr[0])+Math.pow(2, ob1.arr[1]));
        double l2=Math.sqrt(Math.pow(2, ob2.arr[0])+Math.pow(2, ob2.arr[1]));
        System.out.println("Длина первого вектора: "+l1);
        System.out.println("Длина второго вектора: "+l2);
        if(l1>l2) {
            System.out.println("Первый вектор длинее, чем второй");
        }else {
            System.out.println("Второй вектор длинее, чем первый");
        }
    }
    public void sum() {
        Vector ob1=new Vector(Vector.createArr());
        Vector ob2=new Vector(Vector.createArr());
        int[] newvector=new int[2];
        newvector[0]=ob1.arr[0]+ob2.arr[0];
        newvector[1]=ob1.arr[1]+ob2.arr[1];
        System.out.println("Новый вектор х=("+newvector[0]+";"+newvector[1]+")");
    }
    public void comparison() {
        Vector ob1=new Vector(Vector.createArr());
        Vector ob2=new Vector(Vector.createArr());
        if(ob1.arr[0]==ob2.arr[0] && ob1.arr[1]==ob2.arr[1]) {
            System.out.println("Вектора равны");
        }else {
            System.out.println("Вектора не равны");
        }
    }
}
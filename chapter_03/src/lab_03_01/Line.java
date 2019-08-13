package lab_03_01;


import java.util.Scanner;
public class Line {
    public char mas[];
    public Line() {

    }
    public Line(char mas[]) {
        this.mas=mas;
    }
    public static char[] createArr() {
        System.out.println("Введите символы(end для завершения): ");
        Scanner sc=new Scanner(System.in);
        int counter=0;
        char[] arr=new char[10];
        while(counter<arr.length) {
            String s=sc.nextLine();
            if(s.equalsIgnoreCase("end")) {
                break;
            }
            arr[counter]=s.charAt(0);
            counter++;
        }
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
        return arr;
    }
    public static void showOneElement(char[] arr) {
        System.out.println("Введите номер символа: ");
        Scanner scc=new Scanner(System.in);
        int n=scc.nextInt();
        for(int i=0;i<arr.length;i++) {
            if(n==i) {
                System.out.println(arr[i]);
            }else {
                System.out.println("Данного номера нет в строке");
            }
        }
    }
    public void createString(Line ob) {
        String s=String.valueOf(ob);
        System.out.println(s);

    }
    public void comparison() {
        if(String.valueOf(Line.createArr()).equals(String.valueOf(Line.createArr()))) {
            System.out.println("Строки равны");
        }else {
            System.out.println("Строки не равны");
        }
    }
    public void sum() {
        String sum=null;
        sum=String.valueOf(Line.createArr())+String.valueOf(Line.createArr());
        System.out.println(sum);
    }
}
package lab_05;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class BaseColl implements StorageNumber {
    public int number;
    public BaseColl() {}
    public BaseColl(int number) {
        this.number = number;
    }
    @Override
    public String toString() {
        return number + "";
    }
    public ArrayList addAndremove(ArrayList arr) {
        System.out.println("Введите 1 для добавления числа или 2 для удаления");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext()) {
            int n = sc.nextInt();
            if (n == 1) {
                System.out.println("Введите число, которое хотите добавить(end для завершения)");
                Scanner scc = new Scanner(System.in);
                while (true) {
                    if (scc.hasNextInt()) {
                        arr.add(new BaseColl(scc.nextInt()));
                    } else {
                        if (scc.nextLine().equals("end"))
                            break;
                    }
                }
                Iterator itr = arr.iterator();
                System.out.print("[");
                while (itr.hasNext()) {
                    Object element = itr.next();
                    System.out.print(element.toString() + " ");
                }
                System.out.print("]");
            } else {
                if (n == 2) {
                    System.out.println("Введите индекс числа, которое хотите удалить(end для завершения)");
                    Scanner s = new Scanner(System.in);
                    while (true) {
                        try {
                            if (s.hasNextInt()) {
                                arr.remove(s.nextInt());
                            }
                        } catch (IndexOutOfBoundsException e) {
                            System.out.println("Данного индекса нет в массиве");
                        }
                        if (s.nextLine().equals("end")) {
                            break;
                        }
                    }
                    Iterator itr = arr.iterator();
                    System.out.print("[");
                    while (itr.hasNext()) {
                        Object element = itr.next();
                        System.out.print(element.toString() + " ");
                    }
                    System.out.print("]");
                } else {
                    if (n > 2)
                        System.out.println("Введите 1 или 2");
                }
            }
        }
        return arr;
    }
    public void find(ArrayList < Integer > arr, int find) {
        int temp = Math.abs(arr.get(0) - find);
        for (Integer o: arr) {
            if (Math.abs(o - find) < temp) {
                temp = o;
            }
        }
        System.out.println(temp);
    }
    public static void main(String[] args) {
        BaseColl ob = new BaseColl();
        ArrayList < Integer > arr = new ArrayList();
        arr.add(1);
        arr.add(1);
        arr.add(3);
        arr.add(7);
        ob.addAndremove(arr);
        ob.find(arr, 4);
    }
}
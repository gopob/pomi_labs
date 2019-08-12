import java.util.Scanner;


public class lab_01_03 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число Х и У не равные друг другу:");
        int x = 0, y = 0;
        if(in.hasNextInt()){
            x = in.nextInt();
            y = in.nextInt();
            if(x == y){
                System.out.println("Вы ввели равные числа!");
            }
            else{
                if(x < y){
                    int ax = (x + y)/ 2;
                    int by = (x * y) * 2;
                    System.out.println("x = " + ax + ";\ny = " + by);
                }else{
                    int ax = (x * y) * 2;
                    double by = (x + y)/2;
                    System.out.println("x = " + ax + ";\ny = " + by);
                }
            }
        }
    }
}

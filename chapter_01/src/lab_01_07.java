import java.util.Scanner;


public class lab_01_07{
    public static void main(String[] args){
        int a, b, c = 0;

        do{
            a = (int) (Math.random() * 9 ) + 1;
        }
        while(a == 0);
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число из отрезка 1,10");
        if(in.hasNextInt()){
            do{
                b=in.nextInt();
                if(b < 0 || b == 0 || b > 10){
                    System.out.println("Вы ввели число не из-заданного диапазона или 0");
                    System.out.println("Повторите ввод");
                }
                else{
                    ++c;
                    if(b == a){
                        System.out.println("Вы угадали с "+ c +" попытки");
                    }
                    else{
                        if(b < a)System.out.println("Число больше");
                        else System.out.println("Число меньше");

                    }
                }
            }

            while(b != a);
        }
        else System.out.println("Ошибка. Введено не целое число");

    }
}

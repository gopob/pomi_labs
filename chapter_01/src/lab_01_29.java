import java.util.Scanner;
import java.util.Random;

public class lab_01_29 {
    public static void main(String[] args){
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        int n, lCount = 0, rCount = 0;
        System.out.println("Укажите четное число n для размерности массива");
        if (in.hasNextInt()){
            do{
                n = in.nextInt();
                if( n%2 !=0 || n < 1)
                    System.out.println("Введите четное число");
            }
            while(n%2 !=0 || n < 1);
            int[] Arr = new int[n];
            for(int i = 0; i < Arr.length; i++){
                Arr[i] = random.nextInt(11) - 5;
                System.out.print(Arr[i] + " ");

                if(i <= Arr.length/2 - 1){
                    lCount += Math.abs(Arr[i]);
                }
                else {
                    rCount += Math.abs(Arr[i]);
                }

                if(i == Arr.length-1){
                    System.out.println(" ");
                    if(lCount > rCount)
                        System.out.println("Сумма модулей первой половины массива больше и равна " + lCount);
                    if(rCount > lCount)
                        System.out.println("Сумма модулей второй половины массива больше и равна " + rCount);
                    if(rCount == lCount)
                        System.out.println("Суммы модулей первой и второй половины равны");
                }
            }
        }
        else System.out.println("Проверьте правильность данных");
    }
}

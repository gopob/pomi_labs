import java.util.Scanner;


public class lab_01_06 {

    public static void main(String[] args) {

        int a = 0,b = 0,c = 0,n = 0, sum, k = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число k:");
        if(in.hasNextInt()){
            k = in.nextInt();
        }
        for(int i = 0; i <= 9; i++){
            if(i % k == 0){
                a += i;
            }
        }
        for(int i = 0; i <= 99; i++){
            if(i % k == 0){
                b += i;
            }
        }
        for(int i = 0; i <= 999; i++){
            if(i % k == 0){
                c += i;
            }
        }
        for(int i = 0; i <=9999; i++){
            if(i % k == 0){
                n += i;
            }
        }
        sum = a + b + c + n;
        System.out.println(sum);
    }
}

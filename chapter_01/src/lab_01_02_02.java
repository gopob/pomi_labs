import java.util.Scanner;


public class lab_01_02_02 {
    public static void main(String[] args) {
        int first, second, third;
        int n = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое трехзначное число");

        while(in.hasNextInt()){
            n = in.nextInt();
            String s = Integer.toString(n);
            if(s.length() == 3){


                break;
            }else{
                System.out.println("Число должно состоять из 3 цифр \nПопробуйте снова:");
                continue;
            }
        }


        first = n / 100;
        second = n / 10 % 10;
        third = n % 10;

        if((first + second + third) % 2 == 0){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}

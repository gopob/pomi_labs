import java.util.Scanner;


public class lab_01_02_01 {
    public static void main(String[] args) {
        int first, second, third, fourth;
        int n = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите четырехзначное число");

        while(in.hasNextInt()){
            n = in.nextInt();
            String s = Integer.toString(n);
            if(s.length() == 4){


                break;
            }else{
                System.out.println("Число должно состоять из 4 цифр \nПопробуйте снова:");
                continue;
            }
        }


        first = n / 1000;
        second = n / 100 % 10;
        third = n % 100 / 10;
        fourth = n % 1000 % 10;
        if((first + second) == (third + fourth)){
            System.out.println("true");
        }else
            System.out.println("false");
        in.close();
    }
}

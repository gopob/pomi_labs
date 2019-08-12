import java.util.Scanner;


public class lab_01_02_03 {
    public static void main(String[] args) {
        int n = 0;
        int a, b;

        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое двузначное число: ");

        while(in.hasNextInt()){
            n = in.nextInt();
            String s = Integer.toString(n);
            if(s.length() == 2){


                break;
            }else{
                System.out.println("Число должно состоять из 2 цифр \nПопробуйте снова:");
                continue;
            }
        }

        if(n % 2 == 0){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}

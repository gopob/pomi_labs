import java.util.Scanner;


public class lab_01_02_06 {
    public static void main(String[] args) {
        int n = 0;
        int a, b, c, d;
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

        a = n / 1000;
		b = n /100 % 10;
		c = n % 100 /10;
		d = n % 100 % 10;

		if(a == d && b == c){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
    }
}

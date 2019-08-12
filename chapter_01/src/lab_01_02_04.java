import java.util.Scanner;

public class lab_01_02_04 {
    public static void main(String[] args) {
        int a = 0, b = 0, c = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Введите a, b, c: ");
        if(in.hasNextInt()){
            a = in.nextInt();
            b = in.nextInt();
            c = in.nextInt();
        }
        c = (int)Math.pow(c, 2);
        a = (int)Math.pow(a, 2);
        b = (int)Math.pow(b, 2);

        if(c == (a + b)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }


}

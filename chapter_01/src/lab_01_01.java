import java.util.Scanner;


public class lab_01_01 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();
        for (int i = 0; i < 4; i++) {

            System.out.printf("%d степень числа %d =  %.0f  ", i, num, Math.pow(num, i));
        }

        in.close();
    }
}

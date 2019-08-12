import java.util.Scanner;

public class lab_01_16 {
    public static void main(String[] args){
        int a, c = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        if(in.hasNextInt()){
            a = in.nextInt();
            while( a != 0){
                c = c + a%10;
                a /= 10;
            }
            System.out.println("Сумма всех чисел введенного числа равна " + c);
        }
        else System.out.println("Ошибка. Проверьте тип введенных данных");
    }
}

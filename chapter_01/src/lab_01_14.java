import java.util.Scanner;

public class lab_01_14 {
    public static void main(String[] args){

        int a;
        Scanner in=new Scanner(System.in);
        System.out.println("Введите натуральное число");
        if(in.hasNextInt()){
            a = in.nextInt();
            for(int i = (int)Math.sqrt(a); i >= 1; i--){
                if( a % i == 0 & i !=1){
                    System.out.println("Число - составное");
                    System.out.println("Простые делители");
                    for (i = 2; i < a; i++) {
                        if (a % i == 0) {
                            System.out.println(i+"  ");
                        }
                    }
                    break;
                }
                if(i == 1) System.out.println("Число - простое");
            }
        }
        else System.out.println("Ошибка. Проверьте тип введенных данных");
    }
}

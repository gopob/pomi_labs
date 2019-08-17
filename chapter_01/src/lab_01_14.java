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
                    for (int j = 1; j <= a; j++){
                        if (a % j == 0){
                            boolean simple=true;
                            for(int nDiv=2 ; nDiv<=j/2; nDiv++)
                                if(j%nDiv == 0){
                                    simple=false;
                                    break;
                                }
                            if (simple)
                                System.out.println(j);

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

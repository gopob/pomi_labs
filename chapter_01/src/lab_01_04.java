import java.util.Scanner;

public class lab_01_04 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите пароль из 4 цифр:");
        int password = 0;
        while(in.hasNextInt()){
            password = in.nextInt();
            String s = Integer.toString(password);
            if(s.length() == 4){
                password = Integer.valueOf(s);
                System.out.println("Ваш пароль: " + password);
                break;
            }else{
                System.out.println("Пароль должнет состоять из 4 цифр \nПопробуйте снова:");
                continue;
            }
        }
    }
}

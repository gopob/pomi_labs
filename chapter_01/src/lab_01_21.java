import java.util.Random;


public class lab_01_21 {
    public static void main(String[] args){
        Random random = new Random();
        int a= random.nextInt(28800), b = a/3600;
        System.out.println("Секунд осталось " + a);
        switch(b){
            case 0:
                System.out.println("До конца рабочего дня осталось меньше часа");
                break;
            case 1:
                System.out.println("До конца рабочего дня остался " + b + " час");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("До конца рабочего дня осталось " + b + " часа");
                break;
            default:
                System.out.println("До конца рабочего дня осталось " + b  + " часов");
        }
    }
}

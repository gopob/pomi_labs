import java.util.Random;

public class lab_01_19 {
    public static void main(String[] args){
        Random random=new Random();
        int a= random.nextInt(151)+5;
        if(a <= 25 || a>= 100){
            System.out.println("Число " + a + " не содержится в интервале (25,100)");
        }
        else {
            System.out.println("Число " + a + " содержится в интервале (25,100)");
        }
    }
}

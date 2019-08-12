import java.util.Random;

public class lab_01_20 {
    public static void main(String[] args){
        Random random = new Random();
        int s = random.nextInt(899)+100;
        int b = s%10;
        int c = (s/10) % 10;
        int d = (s/100) % 10;
        if(b >= c & b>d || b>c & b >= d){
            System.out.println("В числе " + s + " наибольшая цифра " +b);
        }
        else if (c>b&c>=d) {
                System.out.println("В числе " + s + " наибольшая цифра " +c);
            }
            else {
                System.out.println("В числе " + s + " наибольшая цифра " +d);
            }
    }
}


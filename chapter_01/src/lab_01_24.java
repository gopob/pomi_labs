import java.util.Random;


public class lab_01_24 {
    public static void main(String[] args){
        int[] Arr=new int[4];
        Random random = new Random();
        for(int i = 0; i < Arr.length; i++){
            Arr[i] = random.nextInt(90)+10;
            System.out.print(Arr[i] + " ");
        }
        System.out.println(" ");
        for(int i = 0; i < Arr.length; i++){
            if(i > 0){
                if(Arr[i-1] >= Arr[i]){
                    System.out.println("Прогрессия не возрастающая");
                    break;

                }
            }
            if(i == Arr.length - 1)
                System.out.println("Последовательность строго возрастающая");
        }
    }
}

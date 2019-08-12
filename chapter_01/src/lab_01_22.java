import java.util.Random;

public class lab_01_22 {
    public static void main(String[] args){
        Random random = new Random();

        int [] arr = new int[8];
        for(int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(9) + 1;
            System.out.print(arr[i] +" ");
        }
        System.out.println();
        for(int i = 0; i<arr.length; i++){
            if(arr[i]%2 != 0){
                arr[i]=0;
            }
            System.out.print(arr[i] +" ");
        }
    }
}

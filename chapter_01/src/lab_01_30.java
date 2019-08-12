import java.util.Random;

public class lab_01_30 {
    public static void main(String[] args){
        Random random = new Random();
        int a = 0,b = 0;
        int [] Arr = new int[12];
        do{
            for(int i = 0; i < Arr.length; i++){
                Arr[i] = random.nextInt(21) - 10;
                if(Arr[i] < 0){
                    a++;
                }
                if(Arr[i] > 0){
                    b++;
                }

                if(Arr[i] == 0){
                    --i;
                }
                if(i == Arr.length - 1 & a != Arr.length/2){
                    a = 0;
                    b = 0;
                }
            }
        }
        while (a != Arr.length/2 & b != Arr.length/2);

        for(int i = 0; i < Arr.length; i++){
            System.out.print(Arr[i] + " ");
        }
    }
}

import java.util.Random;
import java.util.Scanner;

public class lab_01_31 {
    public static void main(String[] args){
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        int n = 0, arr2elem = 0;
        do{
            System.out.println("Введите число большее 3");
            if(in.hasNextInt()){
                n=in.nextInt();
            }
            else System.out.println("Проверьте правильность данных");
        }
        while (n < 4);

        int[] Arr1 = new int[n];
        for(int i = 0; i < Arr1.length; i++){
            Arr1[i] = random.nextInt(n+1);
            System.out.print(Arr1[i]+" ");
            if(Arr1[i]%2 == 0 & Arr1[i] !=0 )
                arr2elem++;
        }
        System.out.println("");


        if(arr2elem>0){
            int[] Arr2 = new int[arr2elem];
            for(int i = 0, b = 0; i <Arr1.length; i++){
                if (Arr1[i]%2 == 0 & Arr1[i] != 0){
                    Arr2[b] = Arr1[i];
                    System.out.print(Arr2[b] + " ");
                }
            }
        }
    }
}

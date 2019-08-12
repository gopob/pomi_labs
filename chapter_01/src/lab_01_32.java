import java.util.Random;

public class lab_01_32 {

    public static void main(String[] args){
        Random random = new Random();
        int [][] Arr = new int[6][7];
        int max=0, temp_index=0;;
        for(int i = 0; i < Arr.length; i++){

            System.out.print("Строка №"+i+" ");
            for(int h = 0; h < Arr[i].length; h++){
                Arr[i][h] = random.nextInt(10);
                System.out.print(Arr[i][h]+" ");
                if(h == 0)
                    max = Arr[i][h];
                else {
                    if(max < Arr[i][h]){
                        max = Arr[i][h];
                        temp_index = h;
                    }
                }
                if(h == Arr[i].length - 1){
                    int temp = Arr[i][0];
                    Arr[i][0] = Arr[i][temp_index];
                    Arr[i][temp_index] = temp;
                }
            }
            System.out.println(" ");
        }
        for(int i = 0; i < Arr.length; i++){
            System.out.print("Обработанная строка №"+i+" ");
            for(int h = 0; h < Arr[i].length; h++){
                System.out.print(Arr[i][h] + " ");
            }
            System.out.println(" ");
        }
    }
}

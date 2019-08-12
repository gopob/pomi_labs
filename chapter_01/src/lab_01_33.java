import java.util.Random;

public class lab_01_33 {
    public static void main(String[] args){
        Random random = new Random();
        int [][] Arr = new int[15][3];
        for(int i = 0; i < Arr.length; i++){
            for(int h = 0; h < Arr[i].length; h++){
                Arr[i][h] = random.nextInt(8) + 2;
                if(h == Arr[i].length - 1){
                    Arr[i][h] = Arr[i][h - 2] * Arr[i][h - 1];
                    for(int q = 0; q < i; q++){
                        if(Arr[i][h] == Arr[q][h] && i > 0){
                            if(Arr[i][h - 1] == Arr[q][h - 1] || Arr[i][h - 2] == Arr[q][h - 2])
                                --i;
                        }
                    }
                }
            }
        }

        for(int i = 0; i<Arr.length; i++){
            System.out.print("Задание №"+(i+1+" Умножить "));
            for(int h = 0; h < Arr[i].length; h++){
                if(h == 0)
                    System.out.print(Arr[i][h] + " на ");
                if(h == 1)
                    System.out.println(Arr[i][h]);
            }
        }
    }
}

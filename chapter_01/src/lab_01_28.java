import java.util.Random;


public class lab_01_28 {
    public static void main(String[] args){
        Random random = new Random();

        int aneg = 0, a0 = 0, a1 = 0;
        int[] Arr = new int[11];
        for(int i = 0; i < Arr.length; i++){
            Arr[i] = random.nextInt(3)-1;
            System.out.print(Arr[i] + " ");

            if(Arr[i] < 0)
                aneg++;
            if(Arr[i] == 0)
                a0++;
            if(Arr[i] > 0)
                a1++;

            if(i == Arr.length-1){
                if(aneg > a0 & aneg >a1)
                    System.out.println("Чаще всего встречается -1");
                if(a0 > aneg & a0 > a1)
                    System.out.println("Чаще всего встречается 0");
                if(a1 > aneg & a1 > a0)
                    System.out.println("Чаще всего встречается 1");
            }
        }
        System.out.println();
    }
}

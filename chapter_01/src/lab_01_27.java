import java.util.Random;

public class lab_01_27 {

    public static void main(String[] args){
        Random random = new Random();

        int [] Arr1 = new int [10];
        int [] Arr2 = new int [10];
        double [] Arr3=new double [10];

        int SC = 0;
        for(int i = 0, b = 1; b <= 4; i++){
            if(b == 1){
                Arr1[i] = random.nextInt(8) + 1;
                if(i == 0) {
                    System.out.print((b)+ " массив состоит из следующих элементов: ");
                }
                System.out.print(Arr1[i]+" ");

                if(i == Arr1.length-1) {
                    b++;
                    i = 0;
                    System.out.println(" ");
                }
            }
            if(b == 2) {
                Arr2[i] = random.nextInt(8) + 1;
                if(i == 0) {
                    System.out.print((b)+ " массив состоит из следующих элементов: ");
                }
                System.out.print(Arr2[i]+" ");
                if(i == Arr2.length - 1){
                    b++;
                    i = 0;
                    System.out.println(" ");
                }
            }
            if(b == 3) {
                Arr3[i]=(double)Arr1[i]/Arr2[i];
                if(i == 0) {
                    System.out.print((b)+ " массив состоит из следующих элементов: ");
                }
                System.out.printf("%.2f",Arr3[i]);
                System.out.print(" ");
                if(i == Arr3.length-1){
                    b++;
                    i=0;
                    System.out.println(" ");
                }
            }

            if(b == 4){
                if(Arr3[i] % (int)Arr3[i] == 0){
                    if(SC == 0) {
                        System.out.print("В 3 массиве следующие целые числа: ");
                    }
                    SC++;
                    System.out.print(Arr3[i] + ", ");
                }
                if(i == Arr3.length - 1){
                    if(SC == 0)
                        System.out.println("В третьем массиве нет целых чисел!");
                    break;
                }
            }

        }

    }

}

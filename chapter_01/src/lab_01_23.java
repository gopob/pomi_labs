import java.util.Random;


public class lab_01_23 {
    public static void main(String[] args){
        double sumArr1 = 0, sumArr2 = 0;
        Random random = new Random();
        int[] Arr1 = new int[5];
        for(int i = 0; i < Arr1.length; i++){
            Arr1[i] = random.nextInt(6);
            System.out.print(Arr1[i] + " ");

            sumArr1 += (double)Arr1[i]/Arr1.length;
        }
        System.out.println(" ");

        int[] Arr2 = new int[5];
        for(int i = 0; i < Arr2.length; i++){
            Arr2[i] = random.nextInt(6);
            System.out.print(Arr2[i] +" ");
            sumArr2 += (double)Arr2[i]/Arr2.length;
        }
        System.out.println(" ");

        if(sumArr1 == sumArr2){
            System.out.println("Средние арифметические значения двух массивов равны");
        }
        else if(sumArr1 > sumArr2) {
            System.out.printf("Среднее арифметическое значение первого массива больше и равно: %.1f %n", sumArr1);
        }
        else {
            System.out.printf("Среднее арифметическое значение второго массива больше и равно: %.1f %n", sumArr2);
        }

    }
}

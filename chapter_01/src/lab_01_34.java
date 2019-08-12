import java.util.Random;
import java.util.Scanner;

public class lab_01_34 {
    public static void main(String[] args) {
        int count = 0, sum = 0;
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размерность матрицы N: ");
        int n = in.nextInt();
        if (in.hasNextInt()) {
            n = in.nextInt();
        }
        int Arr[][] = new int[n][n];
        System.out.println("Initial Array");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                Arr[i][j] = random.nextInt(50) - 30;

                System.out.print(Arr[i][j] + " ");
            }
            System.out.println();
        }


        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if(Arr[i][j]>0 && i<j) {
                    count++;
                    sum += Arr[i][j];
                }
            }
        }
        System.out.printf("Сумма положительных элементов - %d, количество положительных элементов - %d", sum, count);
    }
}


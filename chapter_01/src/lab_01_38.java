import java.util.Random;
import java.util.Scanner;

public class lab_01_38 {
    public static void main(String[] args) {
        int sum = 0, sum1=0, k=0, temp;
        boolean magic = true;
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размерность матрицы N: ");
        int n = in.nextInt();
        int [][] Arr = new int[n][n];
        System.out.println("Initial Array");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                Arr[i][j] = random.nextInt(20) - 10;
                System.out.print(Arr[i][j] + "   ");
            }
            System.out.println();
        }

        for(int j = 0; j < n; j++) {
            k += Arr[0][j];
        }

        for(int i = 0; i < n; i++) {
           sum = 0;
           for(int j = 0; j < n; j++) {
               sum += Arr[i][j];
               if(sum != k) {
                    magic = false;
               }
           }
        }

        for(int j = 0; j < n; j++) {
            sum = 0;
            for(int i = 0; i < n; i++) {
                sum += Arr[i][j];
                if(sum != k) {
                    magic = false;
                }
            }
        }

        sum = 0; sum1 = 0;

        for(int i = 0; i < n; i++) {

            for(int j = 0; j < n; j++) {
                if (i == j) {
                    sum += Arr[i][j];
                }
                if (i + j == n + 1) {
                    sum1 += Arr[i][j];
                }
            }
        }

        if (sum != k) {
            magic = false;
        }

        if (magic == true) {
            System.out.println("Матрица - магический квадрат");
        }
        else {
            System.out.println("Матрица - не магический квадрат");
        }
    }
}


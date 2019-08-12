import java.util.Random;
import java.util.Scanner;

public class lab_01_38 {
    public static void main(String[] args) {
        int sum = 0, s;
        boolean magic = true;
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размерность матрицы N: ");
        int n = in.nextInt();
        int Arr[][] = new int[n][n];
        System.out.println("Initial Array");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                Arr[i][j] = random.nextInt(20) - 10;
                System.out.print(Arr[i][j] + "   ");
            }
            System.out.println();
        }

        for (int i = 1; i < n; i++) {
            sum += Arr[1][i];
        }

        for (int i = 1; i < n; i++ ) {
            s = 0;
            for (int j = 1; j < n; j++) {
                s += Arr[i][j];
            }
            if (s != sum) {
                magic = false;
            }
        }

        for (int j = 1; j < n; j++ ) {
            s = 0;
            for (int i = 1; i < n; i++) {
                s += Arr[i][j];
            }
            if (s != sum) {
                magic = false;
            }
        }

        if (magic = true) {
            System.out.println("Матрица - магический квадрат");

        } else {
            System.out.println("Матрица не является магическим квадратом");
        }
    }
}


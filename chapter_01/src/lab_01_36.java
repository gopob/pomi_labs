import java.util.Random;
import java.util.Scanner;

public class lab_01_36 {
    public static void main(String[] args) {
        int max = 0;
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размерность матрицы N: ");
        int n = in.nextInt();
        if (in.hasNextInt()) {
            n = in.nextInt();
        }
        int [][] Arr = new int[n][n];
        System.out.println("Введите заданный номер K: ");
        int k = in.nextInt();
        k--;
        System.out.println("Initial Array");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                Arr[i][j] = random.nextInt(20) - 10;

                System.out.print(Arr[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 1; i < n; i++)
            if(Arr[i][i] > Arr[max][max])
                max = i;
        for (int j=0; j < n; j++)
        {
            int temp = Arr[max][j];
            Arr[max][j] = Arr[k][j];
            Arr[k][j] = temp;
        }

        System.out.println("Modified Array");

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print(Arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}


import java.util.Random;
import java.util.Scanner;

public class lab_01_35 {
    public static void main(String[] args) {
        int count = 0, sum = 0;
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размерность матрицы NxM: ");
        int n = in.nextInt();
        int m = in.nextInt();

        int [][] Arr = new int[n][m];
        System.out.println("Initial Array");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                Arr[i][j] = random.nextInt(50) - 10;

                System.out.print(Arr[i][j] + " ");
            }
            System.out.println();
        }


        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                sum = sum + Arr[j][i];
            }
            for(int a = 0; a < n; a++)
            {
                if(Arr[a][i] > sum - Arr[a][i]) {
                    count++;
                }
            }
            sum=0;
        }
        System.out.printf("Особых элементов - %d", count);
    }
}


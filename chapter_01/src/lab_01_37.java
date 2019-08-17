import java.util.Random;
import java.util.Scanner;

public class lab_01_37 {
    public static void main(String[] args) {
        int max, min, jmax, jmin, temp1, temp2;
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размерность матрицы NxM: ");
        int n = in.nextInt();
        int m = in.nextInt();
        int [][] Arr = new int[n][m];
        System.out.println("Initial Array");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++){
                Arr[i][j] = random.nextInt(20) - 10;

                System.out.print(Arr[i][j] + "   ");
            }
            System.out.println();
        }
        jmin = 0;
        jmax = 0;

        for (int i = 0; i < n; i++){
            jmax = 0;
            max = Arr[i][jmax];

            jmin = m - 1;
            min = Arr[i][jmin];

            for (int j = 0; j < m; j++) {
                if (Arr[i][j] <= min) {
                    jmin = j;
                    min = Arr[i][jmin];
                }
                if (Arr[i][j] >= max) {
                    jmax = j;
                    max = Arr[i][jmax];
                }
            }

            temp1 = Arr[i][0];
            Arr[i][0] = Arr[i][jmax];
            Arr[i][jmax] = temp1;


            temp2 = Arr[i][m - 1];
            Arr[i][m - 1] = Arr[i][jmin];
            Arr[i][jmin] = temp2;
        }


        System.out.println("Modified Array");

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                System.out.print(Arr[i][j] + "   ");
            }
            System.out.println();
        }
    }
}


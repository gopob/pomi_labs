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
        int Arr[][] = new int[n][m];
        System.out.println("Initial Array");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++){
                Arr[i][j] = random.nextInt(20) - 10;

                System.out.print(Arr[i][j] + "   ");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            max = Arr[i][1];
            min = Arr[i][1];
            jmax = 1;
            jmin = 1;
            for (int j = 0; j < m; j++){
               if (Arr[i][j] > max) {
                   max = Arr[i][j];
                   jmax = j;
               }

                if (Arr[i][j] < min) {
                    min = Arr[i][j];
                    jmin = j;
                }
            }

            temp1 = Arr[i][1];
            Arr[i][1] = Arr[i][jmax];
            Arr[i][jmax] = temp1;

            temp2 = Arr[i][m];
            Arr[i][m] = Arr[i][jmin];
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


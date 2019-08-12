import java.util.Random;
import java.util.Scanner;

public class lab_01_39 {
    public static void main(String[] args) {
        int sum = 0, k = 0, imax, jmax, kmin, kmax, temp;
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размерность матрицы NxM: ");
        int n = in.nextInt();
        int m = in.nextInt();
        int Arr[][] = new int[n][m];

        System.out.println("Initial Array");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                Arr[i][j] = random.nextInt(20);
                System.out.print(Arr[i][j] + "    ");
            }
            System.out.println();
        }

        imax = 0;
        jmax = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (Arr[i][j] > Arr[imax][jmax]) {
                        imax = i;
                        jmax = j;
                }
            }
            System.out.println();
        }
        System.out.println("Max = Arr["+imax+"]["+jmax+"] = "+Arr[imax][jmax]);

        if (n < m) {
            kmin = n;
        }
        else {
            kmin = m;
        }
        do {
            System.out.println("Введите число K: ");
            k = in.nextInt();
        }
        while (k > 1 && k < kmin);

        for (int i = 0; i < n; i++) {
            temp = Arr[i][k];
            Arr[i][k] = Arr[i][jmax];
            Arr[i][jmax] = temp;
        }

        for (int j = 0; j < m; j++) {
            temp = Arr[k][j];
            Arr[k][j] = Arr[imax][j];
            Arr[imax][j] = temp;

        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(Arr[i][j] + "   ");
            }
            System.out.println();
        }
    }
}


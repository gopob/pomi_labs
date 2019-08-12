import java.util.Random;
import java.util.Scanner;

public class lab_01_40 {
    public static void main(String[] args) {
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
        System.out.println("Modified Array");

        for (int i = 0; i < Arr.length; i++) {

            for (int j = 0; j < Arr[i].length; j++) {
                if (Arr[i][j] > 0) {
                    Arr[i][j] = 1;
                } else {
                    Arr[i][j] = 0;
                }
                System.out.print(Arr[i][j] + " ");
            }


            System.out.println();

        }
    }
}

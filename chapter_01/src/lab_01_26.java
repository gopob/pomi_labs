import java.util.Random;

public class lab_01_26 {
    public static void main(String[] args) {
        int Arr[] = new int[12];
        int max = Arr[0], index = 0;
        Random random = new Random();

        for (int i = 0; i < Arr.length; i++) {
            Arr[i] = random.nextInt(31) - 15;
            System.out.print(Arr[i] + " ");

        }
        System.out.println();
        for (int i = 0; i < Arr.length; i++) {
            if (Arr[i] >= max ) {
                max = Arr[i];
                index = i;
                index++;
            }
        }
        System.out.println("Самое большое число " + max + " и индекс последнего вхождения " + index);
    }
}

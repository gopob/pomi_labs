public class lab_01_05 {
    public static void main(String[] args) {

        int i, n = 0, a = 0, b = 0, c = 0, sum;
        for(i = 0; i <= 9; i++){
            n += i;
        }
        for(i = 0; i <= 99; i++){
            a +=i;
        }
        for(i = 0; i <= 999; i++){
            b += i;
        }
        for(i = 0; i <= 9999; i++){
            c += i;
        }
        sum = a + b + c;
        System.out.println("Сумма всех n-значных чисел (1 ≤ n ≤ 4) равна: "+ sum);

    }
}

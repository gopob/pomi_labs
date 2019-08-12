public class lab_01_18 {
    public static void main(String[] args){

        int count=0, n;

        for(int i=1; i<=999999; i++){
            n = i;
            while(n != 0){
                if(n % 10 == 4 || n%100 + 10*n % 10 == 13) {
                    count++;
                    break;
                }
                n = n/10;
            }
        }
        System.out.println("Исключить " + count + " номеров");
    }
}

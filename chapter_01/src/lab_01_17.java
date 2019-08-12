public class lab_01_17 {
    public static void main(String[] args){

        int count=0;
        for(int i= 1001; i<1000000; i++){
            int     s1=i/100000%10,
                    s2=i/10000%10,
                    s3=i/1000%10,
                    s4=i/100%10,
                    s5=i/10%10,
                    s6=i%10;

            if((s1 + s2 + s3) == (s4 + s5 + s6)){
                count++;
            }
        }
        System.out.println("Количество счастливых билетов: " + count);
    }
}

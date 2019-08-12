public class lab_01_25 {
    public static void main(String[] args){
        int[] Arr = new int[20];

        for(int i = 0; i < Arr.length; i++){
            if(i < 2){
                Arr[i] = 1;
            }
            else {
                Arr[i] = Arr[i-2] + Arr[i-1];
            }
            System.out.print(Arr[i] + " ");
        }
    }
}

package lab_02_03;



public class Main {
    public static void main ( String[] args ){
        Storage arr[]=Storage.createArr(3);
        Storage.showArr(arr);
        Storage.spisAk(arr, 5);
        Storage.spisAc(arr, 4);
        Storage.spisB(arr);
        Storage.spisC(arr);
        Storage.spisD(11,22,33);
    }
}
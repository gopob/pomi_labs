package lab_02_03;



public class Main {
    public static void main ( String[] args ){
        Storage mas[]=Storage.createMas(3);
        Storage.showMas(mas);
        Storage.spisAk(mas);
        Storage.spisAc(mas);
        Storage.spisB(mas);
        Storage.spisC(mas);
        Storage.spisD(11,22,33);
    }
}
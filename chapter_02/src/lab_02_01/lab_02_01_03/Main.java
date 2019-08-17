package lab_02_01.lab_02_01_03;




public class Main {
    public static void main ( String[] args ){
        Abiturient[] st = new Abiturient[3];
        int[] mas = {1,5,7};
        int[] mas1 = {3,6,8,2};
        st[0] = new Abiturient();
        st[1] = new Abiturient(2,"Ivanov","Ivan","Ivanovich","Ivanovskaya 22", 222222, mas);
        st[2] = new Abiturient(1,"Roma","Shal","Gennad","Mogilev",333333,mas1);
    }
}
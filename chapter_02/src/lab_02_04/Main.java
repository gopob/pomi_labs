package lab_02_04;



public class Main {
    public static void main ( String[] args ){
        Book mas[]=Book.createMas(2);
        Book.showMas(mas);
        String x="",t="";
        int p=0;
        Book.spisA1(mas);
        Book.spisA2(mas);
        Book.spisA3(mas);
        Book.spisA4(mas);
        Book.spisB(mas);
        Book.spisA1(mas,x,t);
        Book.spisA2(mas, x, t);
        Book.spisA3(mas, x, p);
        Book.spisA4(mas, x, p);
    }
}
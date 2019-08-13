package lab_03_04.lab_03_04_02;






public class Main {
    public static void main(String[] args) {
        Employee petrov=new Engineer(8);
        Employee sidorov=new Boss(6,"орёт на рабочих");
        petrov.howmuch();
        sidorov.howmuch();
    }
}

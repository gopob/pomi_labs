package lab_02_07;

public class Main {
    public static void main(String[] args) {
        Array el1 = new Array("QWERTY123");
        Array el2 = new Array("QanRTkj32p1Y");
        Array el3 = new Array("asdfg0");
        Array el4 = new Array("stringOne");
        Array el5 = new Array("stringTwo");

        Array elem[] = new Array[3];
        elem[0] = new Array("ABC");
        elem[1] = new Array("19B");
        elem[2] = new Array("qwert91");



        Array.useSymbol(el3, 'd');
        Array.intersection(el1, el2);
        Array.grouping(el2, el3);
        Array.difference(el1, el2);
        Array.addition(el4, el5);
        Array.getNewSymbol(el4, 'I');
        Array.oneOfCouple(elem);

    }
}
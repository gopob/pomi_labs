package lab_02_07;



public class Main {
    public static void main ( String[] args ){
        Array brs1 = new Array("QWERTY123");
        Array brs2 = new Array("QanRTkj32p1Y");
        Array brs3 = new Array("asdfg0");
        Array brs4 = new Array("ROMA");
        Array brs5 = new Array("real");

        Array bras[] = new Array[3];
        bras[0] = new Array("ABC");
        bras[1] = new Array("19B");
        bras[2] = new Array("qwert91");


        Array.useSymbol(brs3, 'd');
        Array.intersection(brs1, brs2);
        Array.grouping(brs2, brs3);
        Array.difference(brs1, brs2);
        Array.addition(brs5, brs4);
        Array.getNewSymbol(brs4, 'I');
        Array.oneOfCouple(bras);

    }
}
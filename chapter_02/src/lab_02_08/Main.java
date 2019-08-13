package lab_02_08;

public class Main {
    public static void main ( String[] args ){
        Equation ob=new Equation(1,1,-6);
        ob.root(ob);
        ob.extremum(ob);
        ob.gap(ob);
        Equation mas[]=Equation.createMas(2);
        Equation.showMas(mas);
        Equation.masSort(mas);

    }
}
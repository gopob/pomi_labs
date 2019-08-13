package lab_05;

import java.util.*;

public class PosAndNeg {
    public int number;
    public PosAndNeg() {
    }
    public PosAndNeg(int number) {
        this.number=number;
    }
    @Override
    public String toString() {
        return "NewPosAndNeg [number=" + number + "]";
    }
    public static void posAndNeg(ArrayList<PosAndNeg> arr) {
        LinkedList<PosAndNeg> a=new LinkedList<PosAndNeg>();
        for(PosAndNeg o:arr) {
            if(o.number>=0) {
                a.addFirst(o);
            }else{
                a.addLast(o);
            }
        }
        Iterator<PosAndNeg> itr = a.iterator();
        while (itr.hasNext()) {
            PosAndNeg element = itr.next();
            System.out.println(element.toString());
        }
    }
    public static void main(String[] args) {
        ArrayList<PosAndNeg> arr=new ArrayList<PosAndNeg>();
        arr.add(new PosAndNeg(1));
        arr.add(new PosAndNeg(-1));
        arr.add(new PosAndNeg(-5));
        arr.add(new PosAndNeg(3));
        arr.add(new PosAndNeg(-3));
        arr.add(new PosAndNeg(6));
        arr.add(new PosAndNeg(9));
        posAndNeg(arr);
    }
}
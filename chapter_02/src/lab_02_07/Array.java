package lab_02_07;

public class Array {
    private String arr;

    public Array(String arr) {
        this.arr = arr;
    }

    public Array() {

    }

    public String getArr() {
        return arr;
    }

    public void setArr(String arr) {
        this.arr = arr;
    }

    @Override
    public String toString() {
        return "Множество: " + arr;
    }

    public static void useSymbol(Array m, char v) {
        System.out.println();
        int t=0;
        for(int i=0; i<m.getArr().length(); i++) {
            if(m.getArr().charAt(i)==v) {
                System.out.println("Символ " + v + " присутствует в строке.");
                t++;
            }
        }
        if(t==0){
            System.out.println("В строке нет такого символа.");
        }
    }

    public static void intersection(Array m, Array v) {
        System.out.println();
        int t=0;
        char o = ' ';
        String one = "";
        for(int i=0; i<m.getArr().length(); i++) {
            for(int l=0; l<v.getArr().length(); l++ ) {
                if(m.getArr().charAt(i)==v.getArr().charAt(l)) {
                    o = m.getArr().charAt(i);
                    one = one + o;
                    t++;
                }
            }
        }
        if(t==0) {
            System.out.println("Пересечения в данных множествах отсутствуют.");
        }
        else if(t>0) {
            System.out.println("Общие символы множеств: ");
            for(int i=0; i<one.length(); i++) {
                System.out.print(one.charAt(i));
            }
        }
        System.out.println();
    }

    public static void grouping(Array m, Array v) {
        System.out.println();
        String t1 = m.getArr();
        String t2 = v.getArr();
        m.setArr(t1 + t2);
        v.setArr(t1 + t2);
        System.out.println("Первое множество после объединения: " + m.getArr());
        System.out.println("Второе множество после объединения: " + v.getArr());
    }

    public static void difference(Array m, Array v) {
        System.out.println();
        int t=0, ind=0;
        String one = m.getArr();
        for(int i=0; i<m.getArr().length(); i++) {
            for(int l=0; l<v.getArr().length(); l++ ) {
                if(m.getArr().charAt(i)==v.getArr().charAt(l)) {
                    ind = i-t;
                    one = removeCharAt(one,ind);
                    t++;
                }
            }
        }
        if(t==0) {
            System.out.println("Пересечения в данных множествах отсутствуют.");
        }
        else if(t>0) {
            m.setArr(one);
            System.out.println("Разность двух множеств: " + m.getArr());
        }
    }

    public static String removeCharAt (String s, int pos) {
        return s.substring(0, pos) + s.substring(pos+1);
    }

    public static void addition(Array m, Array v) {
        System.out.println();
        System.out.println("Результат сложения множеств: " + m.getArr() + v.getArr());
    }

    public static void getNewSymbol(Array m, char v) {
        System.out.println();
        m.setArr(m.getArr() + v);
        System.out.println("Множество после добавление символа: " + m.getArr());
    }

    public static void oneOfCouple(Array m[]) {
        System.out.println();
        String all = "";
        int t=0, x=0, ind=0;
        for(int i=0; i<m.length; i++) {
            all = all + m[i].getArr();
        }
        for(int i=0; i<m.length-1; i++) {
            for(int l=0; l<m[i].getArr().length(); l++) {
                for(int k=0; k<m[i+1].getArr().length(); k++) {
                    if(m[i].getArr().charAt(l)==m[i+1].getArr().charAt(k)) {
                        ind = x-t;
                        all = removeCharAt(all, ind);
                        t++;
                    }
                }
                x++;
            }
        }
        System.out.println("Сортировка множество попарно: " + all);
    }
}
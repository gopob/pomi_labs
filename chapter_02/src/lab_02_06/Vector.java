package lab_02_06;

public class Vector {
    public int x1,x2,x3;

    public Vector(int x1, int x2, int x3) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
    }
    public Vector() {
    }

    public static void sumV(Vector ob1,Vector ob2) {
        int sumV1=ob1.x1+ob2.x1;
        int sumV2=ob1.x2+ob2.x2;
        int sumV3=ob1.x3+ob2.x3;
        System.out.println("Сумма векторов: z=("+sumV1+";"+sumV2+";"+sumV3+")");
    }
    public static void difV(Vector ob1,Vector ob2) {
        int difV1=ob1.x1-ob2.x1;
        int difV2=ob1.x2-ob2.x2;
        int difV3=ob1.x3-ob2.x3;
        System.out.println("Разность векторов: z=("+difV1+";"+difV2+";"+difV3+")");
    }
    public static void multV(Vector ob1,Vector ob2) {
        int multV1=ob1.x1*ob2.x1;
        int multV2=ob1.x2*ob2.x2;
        int multV3=ob1.x3*ob2.x3;
        System.out.println("Произведение векторов: z=("+multV1+";"+multV2+";"+multV3+")");
    }
    public static void inc(Vector ob1) {
        ob1.x1++;
        ob1.x2++;
        ob1.x3++;
        System.out.println("Новый вектор: z=("+ob1.x1+";"+ob1.x2+";"+ob1.x3+")");
    }
    public static void dec(Vector ob1) {
        ob1.x1--;
        ob1.x2--;
        ob1.x3--;
        System.out.println("Новый вектор: z=("+ob1.x1+";"+ob1.x2+";"+ob1.x3+")");
    }

    public void show() {
        System.out.println("z=("+x1+";"+x2+";"+x3+")");
    }
    public static Vector[] createMas(int n,Vector ob1,Vector ob2) {
        Vector mas[] = new Vector[n];
        mas[0]=ob1;
        mas[1]=ob2;
        return mas;
    }
    public static void showMas(Vector[] mas) {
        for (int i = 0; i < mas.length; i++) {
            mas[i].show();
        }
        System.out.println();
    }
    public static double scalar(Vector[] mas) {
        int scal=mas[0].x1*mas[1].x1+mas[0].x2*mas[1].x2+mas[0].x3*mas[1].x3;
        System.out.println("Скалярное произведение векторов: "+scal);
        return scal;
    }
    public static double lenV1(Vector[] mas) {
        double lenV1=Math.sqrt(Math.pow(2, mas[0].x1)+Math.pow(2, mas[0].x2)+Math.pow(2, mas[0].x3));
        System.out.println("Длина первого векторов: "+lenV1);
        return lenV1;
    }
    public static double lenV2(Vector[] mas) {
        double lenV2=Math.sqrt(Math.pow(2, mas[1].x1)+Math.pow(2, mas[1].x2)+Math.pow(2, mas[1].x3));
        System.out.println("Длина второго векторов: "+lenV2);
        return lenV2;
    }
    public static void corner(Vector[] mas) {
        double j=Math.cos(mas[0].scalar(mas)/(mas[0].lenV1(mas)*mas[1].lenV2(mas)));
        System.out.println("Угол между векторами: "+j);
    }

}

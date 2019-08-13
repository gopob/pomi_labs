package lab_03_01;


import java.util.Arrays;
import java.util.Scanner;
public class Matrix {
    public int mas[][];
    public Matrix() {
    }
    public Matrix(int mas[][]) {
        this.mas=mas;
    }
    public Matrix(int mas[][],Matrix ob) {
        this.mas=ob.mas;
    }
    public static int[][] createMas() {
        System.out.println("Введите количество элементов массива:");
        Scanner sc = new Scanner(System.in);
        int m = 0, n = 0, mas[][];
        if (sc.hasNextInt()) {
            m = sc.nextInt();
            n = sc.nextInt();
        }
        mas=new int[m][n];
        System.out.println("Введите значение элемента: ");
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                Scanner scc = new Scanner(System.in);
                if (scc.hasNextInt()) {
                    int z=scc.nextInt();
                    mas[i][j]=z;
                }
            }
        }
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.print(mas[i][j] + "\t");
            }
            System.out.println();
        }
        return mas;
    }
    public static int[][] createArr(){
        int[][] arr=new int[2][2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        return arr;
    }
    public static void showElement(int mas[][]) {
        System.out.println("Введите строку: ");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int s=sc.nextInt();
            s--;
            System.out.println("Введите столбец: ");
            Scanner scc = new Scanner(System.in);
            if (scc.hasNextInt()) {
                int t=scc.nextInt();
                t--;
                for (int i = 0; i < mas.length; i++) {
                    for (int j = 0; j < mas[i].length; j++) {
                        if(i==s && t==j) {
                            System.out.println("Искомый элемент: "+mas[i][j]);
                        }
                    }
                }
            }

            scc.close();
        }
        sc.close();
    }
    public static void scaling(int mas[][]) {
        int d=2;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j]/=d;
            }
        }
        for (int i = 0; i <mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.print(mas[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static int[][] sumMatrix(int[][] firstMatrix, int[][] secondMatrix) {
        int[][] sum = new int[2][2];
        for (int i = 0; i < firstMatrix.length; i++) {
            for (int j = 0; j < secondMatrix.length; j++) {
                sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }
        return sum;
    }
    public void comparison() {
        System.out.println(Arrays.deepEquals(Matrix.createArr(), Matrix.createArr()));
    }
    public void sum() {
        System.out.println(Matrix.sumMatrix(Matrix.createArr(),Matrix.createArr()));

    }
}
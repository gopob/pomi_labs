package lab_03_03;



public class Vector implements Norm {
    public int arr[];
    public Vector() {}
    public Vector(int arr[]) {
        this.arr = arr;
    }
    public static int[] createArr() {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 10 - 5);
        }
        return arr;
    }
    public static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    public void norm() {
        double n = Math.sqrt(Math.abs(Vector.sum(Vector.createArr())));
        System.out.println("Норма вектора: " + n);
    }

}
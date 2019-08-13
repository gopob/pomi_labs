package lab_02_03;

public class Storage {
    private int kol;
    private double cost;
    private String tov;
    public static int k;
    public static double c;

    public Storage() {
    }
    public Storage(String tov,int kol, double cost) {
        this.tov=tov;
        this.kol=kol;
        this.cost=cost;
    }

    public int getKol() {
        return kol;
    }
    public void setKol(int kol) {
        this.kol = kol;
    }
    public double getCost() {
        return cost;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }
    public String getTov() {
        return tov;
    }
    public void setTov(String tov) {
        this.tov = tov;
    }
    @Override
    public String toString() {
        return "Storage [kol=" + kol + ", cost=" + cost + ", tov=" + tov + "]";
    }

    public void show() {
        System.out.println("tov: "+this.tov+", kol: "+kol+", cost: "+cost);
    }
    public void shownewkol() {
        System.out.println("tov: "+this.tov+", kol: "+k+", cost: "+cost);
    }
    public void shownewcost() {
        System.out.println("tov: "+this.tov+", kol: "+kol+", cost: "+c);
    }

    public static Storage[] createMas(int n) {
        Storage mas[] = new Storage[n];
        mas[0]=new Storage("Table",11,11);
        mas[1]=new Storage("Cap",22,22);
        mas[2]=new Storage("Computer",33,33);
        return mas;
    }
    public static void showMas(Storage[] mas) {
        for (int i = 0; i < mas.length; i++) {
            mas[i].show();
        }
        System.out.println();
    }

    public static void spisAk(Storage[] mas) {
        for (int i = 0; i < mas.length; i++) {
            k=12;
            k=mas[i].getKol()+12;
            mas[i].shownewkol();
        }
    }
    public static void spisAc(Storage[] mas) {
        for (int i = 0; i < mas.length; i++) {
            c=12;
            c=mas[i].getCost()+12;
            mas[i].shownewcost();
        }
    }
    public static void spisB(Storage[] mas) {
        for (int i = 0; i < mas.length; i++) {
            double allcost=mas[i].getKol()*mas[i].getCost();
            System.out.println("tov: "+mas[i].getTov()+", allcost: "+allcost);
        }
    }
    public static void spisC(Storage[] mas) {
        double max=mas[0].getCost();
        for (int i = 1; i < mas.length; i++) {
            if(mas[i].getCost()>max) {
                max=mas[i].getCost(); }

        }
        System.out.println("Максимальная цена: "+max);
    }
    public static void spisD(int... v) {
        int sum=0;
        for(int x:v) {
            sum+=x;
        }
        System.out.println("общее количество товара: "+sum);
    }
}
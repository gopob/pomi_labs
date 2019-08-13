package lab_03_04.lab_03_04_04;

public class Tanker extends Carrier implements Ship{
    private double oil;
    public Tanker() {
        super();
    }
    public Tanker(int number,String[] arr,double oil) {
        super(number,arr);
        this.oil=oil;
    }
    public Tanker(Tanker ob,double oil) {
        super(ob);
        this.oil=ob.oil;
    }
    public double getOil() {
        return oil;
    }
    public void setOil(double oil) {
        this.oil = oil;
    }
    @Override
    public void cargo() {
        Tanker ob=new Tanker(2,Carrier.createArr(),200);
        System.out.println("Номер груза: "+getNumber()+"; "+ob.toString()+"; количество нефти (тонн): "+oil);
    }

}
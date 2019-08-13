package lab_03_04.lab_03_04_03;

public class Theatre extends PublicBuilding{
    private String s;
    public Theatre() {
    }
    public Theatre(int people,String s) {
        super(people);
        this.s=s;
    }
    public String getS() {
        return s;
    }
    public void setS(String s) {
        this.s = s;
    }
    public void look() {
        System.out.println("Количество людей: "+getPeople()+s);
    }

}

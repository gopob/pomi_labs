package lab_03_04.lab_03_04_03;

public abstract class PublicBuilding implements Building {
    private int people;
    public PublicBuilding() {}
    public PublicBuilding(int people) {

        this.people = people;
    }
    public int getPeople() {
        return people;
    }
    public void setPeople(int people) {
        this.people = people;
    }
    public abstract void look();
}